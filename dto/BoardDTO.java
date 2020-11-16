package dto;

import java.util.Calendar;

public class BoardDTO {
private int id;
private int writerId;
private String title;
private String content;
private Calendar writterDate;
private Calendar updatedDate;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public int getWriterId() {
    return writerId;
}
public void setWriterId(int writerId) {
    this.writerId = writerId;
}
public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
public String getContent() {
    return content;
}
public void setContent(String content) {
    this.content = content;
}
public Calendar getWritterDate() {
    return writterDate;
}
public void setWritterDate(Calendar writterDate) {
    this.writterDate = writterDate;
}
public Calendar getUpdatedDate() {
    return updatedDate;
}
public void setUpdatedDate(Calendar updatedDate) {
    this.updatedDate = updatedDate;
}

public boolean equals(Object o) {
    if(o instanceof BoardDTO) {
        BoardDTO b = (BoardDTO)o;
        if(id == b.id) {
            return true;
        }
    }
    
    
    return false;
}


}
