using UnityEngine;
using UnityEngine.SceneManagement;

public class LevelComlplete : MonoBehaviour
{
    public void LoadNextLevel()
    {
        SceneManager.LoadScene(SceneManager.GetActiveScene().buildIndex + 1);
    }
}
