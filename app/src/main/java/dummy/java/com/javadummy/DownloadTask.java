package dummy.java.com.javadummy;

import android.util.Log;

import java.util.Random;

/**
 * Created by zopper on 12/10/15.
 */
public class DownloadTask  implements Runnable
{
    private static final String TAG = DownloadTask.class.getSimpleName();

    private static final Random random = new Random();

    private int lengthSec;

    public DownloadTask()
    {
        lengthSec = random.nextInt(3) + 1;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(lengthSec * 1000);

            Log.e(TAG, "Times:" + lengthSec);

            // it's a good idea to always catch Throwable
            // in isolated "codelets" like Runnable or Thread
            // otherwise the exception might be sunk by some
            // agent that actually runs your Runnable - you
            // never know what it might be.
        }
        catch (Throwable t)
        {
            Log.e(TAG, "Error in DownloadTask", t);
        }
    }
}
