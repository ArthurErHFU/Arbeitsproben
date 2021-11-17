using UnityEngine;
using UnityEngine.SceneManagement;

public class GameManeger : MonoBehaviour
{
    bool gamesHasEndet = false;

    public float restartDelay = 1f;

    public GameObject completeLevelUI;

    public void Complete()
    {
        Debug.Log("LEVEL COMPPLETE");
        completeLevelUI.SetActive(true);
    }

public void EndGame(){
        if(gamesHasEndet == false)
        {
            Debug.Log("Game over");
            gamesHasEndet = true;
            Invoke("Restart", restartDelay);//Delay bevor the Mehtod Restart() starts ;
        }
    }

    void Restart()
    {
        SceneManager.LoadScene(SceneManager.GetActiveScene().name);
    }

}

