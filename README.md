# :clipboard: Custom ListView Android Application 

## MainActivity :memo:
`MainActivity` acts as the main interface of the app, displaying a custom ListView.

### Key Components
- **ListView**: A view group that displays a list of scrollable items.
- **String Arrays**: Arrays holding titles and descriptions for list items.
- **Integer Array**: Holds resource IDs for images.

### Functionality
- Initializes String arrays for titles and descriptions, and an Integer array for images.
- Creates an instance of `MyArrayAdapter` with the arrays.
- Sets the custom adapter to the ListView to display the items.

## MyArrayAdapter :page_with_curl:
A custom adapter extending `ArrayAdapter<String>` to provide layout for each list item.

### Constructor
- Accepts context, titles, descriptions, and images.
- Sets the context and copies the passed arrays for internal use.

### getView Method
- Inflates `item_view.xml` for each list item.
- Binds the title, description, and image to each item view.

## XML Layouts :bookmark_tabs:
### MainActivity Layout (`activity_main.xml`)
- Defines a `ConstraintLayout` containing a `TextView` as a header and a `ListView`.
- `TextView` serves as a title for the ListView.

### Item View Layout (`item_view.xml`)
- `LinearLayout` with horizontal orientation.
- Contains an `ImageView` for displaying images.
- Nested `LinearLayout` with two `TextView`s for title and description.

## Our App 📷

![image](https://github.com/pmoschos/CustomListViewApp02/assets/133533759/9a455f29-f286-418f-95ea-088c84870a1e)

## Conclusion :checkered_flag:
This app demonstrates the use of a custom `ArrayAdapter` to create a ListView with a custom layout, showing a combination of text and images. This provides a template for creating complex list-based UIs in Android applications.

<h1 align=center>Happy Coding 👨‍💻 </h1>

<p align="center">
  Made with ❤️ by Panagiotis Moschos (https://github.com/pmoschos)
</p>

