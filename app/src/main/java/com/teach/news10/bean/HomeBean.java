package com.teach.news10.bean;

import java.util.List;

public class HomeBean {
    /**
     * code : 200
     * message : 成功!
     * result : [{"sid":"31004221","text":"妹妹的表情太到位了！！","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0409/5e8f2419b432a_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0409/5e8f2419b432a_wpd.mp4","images":null,"up":"105","down":"5","forward":"0","comment":"21","uid":"23134458","name":"用木头车个珠子","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1da95a7edb9_mini.jpg","top_comments_content":"一看就是富贵人家的小姐","top_comments_voiceuri":"","top_comments_uid":"22891706","top_comments_name":"奔跑的蚂蚁LC1","top_comments_header":"http://wimg.spriteapp.cn/profile/large/2018/12/30/5c28d1dd5b922_mini.jpg","passtime":"2020-04-11 20:43:46"},{"sid":"30558997","text":"搞定媳妇（10）","type":"video","thumbnail":"http://wimg.spriteapp.cn/picture/2020/0306/5e613e842e204_wpd.jpg","video":"http://uvideo.spriteapp.cn/video/2020/0306/5e613e842e204_wpd.mp4","images":null,"up":"75","down":"6","forward":"0","comment":"3","uid":"23126600","name":"冠华pgh13","header":"http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1d6b4806e41_mini.jpg","top_comments_content":null,"top_comments_voiceuri":null,"top_comments_uid":null,"top_comments_name":null,"top_comments_header":null,"passtime":"2020-04-11 20:43:15"}]
     */

    private int code;
    private String message;
    private List<ResultBean> result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * sid : 31004221
         * text : 妹妹的表情太到位了！！
         * type : video
         * thumbnail : http://wimg.spriteapp.cn/picture/2020/0409/5e8f2419b432a_wpd.jpg
         * video : http://uvideo.spriteapp.cn/video/2020/0409/5e8f2419b432a_wpd.mp4
         * images : null
         * up : 105
         * down : 5
         * forward : 0
         * comment : 21
         * uid : 23134458
         * name : 用木头车个珠子
         * header : http://wimg.spriteapp.cn/profile/large/2019/07/04/5d1da95a7edb9_mini.jpg
         * top_comments_content : 一看就是富贵人家的小姐
         * top_comments_voiceuri :
         * top_comments_uid : 22891706
         * top_comments_name : 奔跑的蚂蚁LC1
         * top_comments_header : http://wimg.spriteapp.cn/profile/large/2018/12/30/5c28d1dd5b922_mini.jpg
         * passtime : 2020-04-11 20:43:46
         */

        private String sid;
        private String text;
        private String type;
        private String thumbnail;
        private String video;
        private Object images;
        private String up;
        private String down;
        private String forward;
        private String comment;
        private String uid;
        private String name;
        private String header;
        private String top_comments_content;
        private String top_comments_voiceuri;
        private String top_comments_uid;
        private String top_comments_name;
        private String top_comments_header;
        private String passtime;

        public String getSid() {
            return sid;
        }

        public void setSid(String sid) {
            this.sid = sid;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getVideo() {
            return video;
        }

        public void setVideo(String video) {
            this.video = video;
        }

        public Object getImages() {
            return images;
        }

        public void setImages(Object images) {
            this.images = images;
        }

        public String getUp() {
            return up;
        }

        public void setUp(String up) {
            this.up = up;
        }

        public String getDown() {
            return down;
        }

        public void setDown(String down) {
            this.down = down;
        }

        public String getForward() {
            return forward;
        }

        public void setForward(String forward) {
            this.forward = forward;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getHeader() {
            return header;
        }

        public void setHeader(String header) {
            this.header = header;
        }

        public String getTop_comments_content() {
            return top_comments_content;
        }

        public void setTop_comments_content(String top_comments_content) {
            this.top_comments_content = top_comments_content;
        }

        public String getTop_comments_voiceuri() {
            return top_comments_voiceuri;
        }

        public void setTop_comments_voiceuri(String top_comments_voiceuri) {
            this.top_comments_voiceuri = top_comments_voiceuri;
        }

        public String getTop_comments_uid() {
            return top_comments_uid;
        }

        public void setTop_comments_uid(String top_comments_uid) {
            this.top_comments_uid = top_comments_uid;
        }

        public String getTop_comments_name() {
            return top_comments_name;
        }

        public void setTop_comments_name(String top_comments_name) {
            this.top_comments_name = top_comments_name;
        }

        public String getTop_comments_header() {
            return top_comments_header;
        }

        public void setTop_comments_header(String top_comments_header) {
            this.top_comments_header = top_comments_header;
        }

        public String getPasstime() {
            return passtime;
        }

        public void setPasstime(String passtime) {
            this.passtime = passtime;
        }
    }
}
