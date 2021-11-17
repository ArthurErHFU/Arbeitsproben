
using UnityEngine;

public class PlayerCollision : MonoBehaviour {

    public PlayerMovment movment;

    void OnCollisionEnter(Collision collision)
    {
      if(collision.collider.tag == "Obstacle")
        {
            movment.enabled = false;
            FindObjectOfType<GameManeger>().EndGame();
        }
    }
}


