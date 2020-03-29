package com.zhenmei.p7i.ninegrid;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.blankj.utilcode.util.ActivityUtils;
import com.zhenmei.p7i.ninegrid.round.RoundNineGridView;
import com.zhenmei.p7i.ninegrid.round.preview.RoundImagePreviewActivity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RoundNineGridView nineGridView;
    private List<ImageInfo> imageInfos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nineGridView = findViewById(R.id.ngiv_image);
        ArrayList<ImageInfo> list = new ArrayList<>();

        List<String> imageUrls = new ArrayList<>();
        imageUrls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579961620720&di=2d173332720443876986e98d9860dfe4&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fa8014c086e061d9513b305a87bf40ad163d9caac.jpg");
        imageUrls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579961620720&di=2d173332720443876986e98d9860dfe4&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fa8014c086e061d9513b305a87bf40ad163d9caac.jpg");
        imageUrls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579961620720&di=2d173332720443876986e98d9860dfe4&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fa8014c086e061d9513b305a87bf40ad163d9caac.jpg");
        imageUrls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579961620720&di=2d173332720443876986e98d9860dfe4&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fa8014c086e061d9513b305a87bf40ad163d9caac.jpg");
        imageUrls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579961620720&di=2d173332720443876986e98d9860dfe4&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fa8014c086e061d9513b305a87bf40ad163d9caac.jpg");
        imageUrls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1579961620720&di=2d173332720443876986e98d9860dfe4&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fpic%2Fitem%2Fa8014c086e061d9513b305a87bf40ad163d9caac.jpg");
        imageUrls.add("https://pics0.baidu.com/feed/42a98226cffc1e17b93ecec67190ea05728de94e.jpeg?token=4b39b0e3e8aa2fa0b13be0b10383c3fb&s=F010529746105DCC5418B6D1030000A9");
        imageUrls.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582454283132&di=c0ac76a77c6959c67b8286d142470c6c&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20170917%2F9ab8f252a2ca4587a3391a6140bb3194.gif");


        for (String url : imageUrls) {
            ImageInfo info = new ImageInfo();
            info.setBigImageUrl(url);
            info.setThumbnailUrl(url);
            list.add(info);
        }
//        nineGridView.setAdapter(new NineGridViewClickAdapter(this, list));




        Intent intent = new Intent(this, RoundImagePreviewActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(RoundImagePreviewActivity.IMAGE_INFO, (Serializable) list);
        bundle.putInt(RoundImagePreviewActivity.CURRENT_ITEM, 1);
        intent.putExtras(bundle);
        ActivityUtils.startActivity(intent);






    }
}
