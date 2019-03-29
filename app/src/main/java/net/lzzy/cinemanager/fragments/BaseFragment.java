package net.lzzy.cinemanager.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Objects;


/**
 *
 * @author lzzy_gxy
 * @date 2019/3/27
 * Description:
 */
public  abstract class BaseFragment extends Fragment  {
    public BaseFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutRes(),container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        populate();
    }

    /**
     * 执行onCreateView中初始化试图组件、填充数据的任务
     */

    protected abstract void populate();

    /**
     *  Fragment的布局文件
     * @return
     */
    public abstract int getLayoutRes();

    <T extends View> T find(@IdRes int id){
        return Objects.requireNonNull(getView()).findViewById(id);
    }
}