package sandor.marioappli;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by sandor on 16-1-2015.
 */
public class Aanvraagmenu extends Fragment
{
    View rootview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container , Bundle savedInstanceState)
    {
       rootview = inflater.inflate(R.layout.aanvraagmenu, container ,false);
        return rootview;
    }
}
