using UnityEngine;

public class PlayerMovment : MonoBehaviour
{

    public Rigidbody rb;

    public float forwardForce = 2000f;
    public float sideForce = 500f;


    // Update is called once per frame for Phyisixs
    void FixedUpdate()
    {
        rb.AddForce(0, 0, forwardForce * Time.deltaTime);

        if (Input.GetKey("d")) //there is a better way to get inputkey
        {
            rb.AddForce(sideForce * Time.deltaTime, 0, 0, ForceMode.VelocityChange);
        }

        if (Input.GetKey("a"))
        {
            rb.AddForce(-sideForce * Time.deltaTime, 0, 0, ForceMode.VelocityChange);
        }

        if(rb.position.y < -1)
        {
            FindObjectOfType<GameManeger>().EndGame();
        }
    }
}
