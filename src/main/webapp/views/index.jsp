<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pl-PL">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Craft Artis</title>
        <meta name="description" content="">
        <meta name="keywords" content="">
        
        <meta name="viewport" content="width=device-width, initial-scale=0.6">
        
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Merriweather:300,400" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/css_reset.css">
        <link rel="stylesheet" type="text/css" href="<c:url value="css/style.css" />" >
    </head>
    <body>
        
        <!--********* NAVIGATOR **********************************************-->
        <nav><br>
            <div>
                <ul>
                    <li><a href="#">CraftArtis</a></li>
                    <li class="media"><a href="#news">Nowości</a></li>
                    <li class="media"><a href="#clothes">Ubrania</a></li>
                    <li class="media"><a href="#accessories">Dodatki</a></li>
                    <li class="media"><a href="#toys">Zabawki</a></li>
                    <li class="media"><a href="#other">Inne</a></li>
                    <li><a href="#contact">Kontakt</a></li>
                </ul>
            </div>
        </nav>
        
        <!--********* HEADER **********************************************-->
        <header id="banner" >
            <div class="background">
                <div class="main">
                    <div class="post">
                        <h1>CRAFTARTIS</h1><br><br>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras a tincidunt magna. Morbi ac ultricies mi, at condimentum nisl. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Nulla in lobortis ipsum. Donec eget enim varius, vehicula magna non, faucibus nibh. Sed viverra sit amet risus a eleifend. Donec sed dui ac mauris porta tempor vel non nunc. Duis tincidunt accumsan lectus, et maximus libero luctus in. Fusce consequat nisi non tincidunt interdum. Aliquam eget libero vel nunc tincidunt vestibulum eu et velit.
                        </p>
                    </div>
                </div>

            </div>
        </header>

        <div class="blog, buttons">
            <button>Dodaj  nowy</button>
        </div>
        
        <!--********* NEWS **********************************************-->
        <section class="blog" id="news">
            <div class="post">
                <h2>&gt;&gt;&gt;&nbsp;NOWOŚCI&nbsp;&lt;&lt;&lt;</h2>

                <strong class="title">Jakaś nazwa</strong>
                <div class="images">
                    <div class="image-container">
                        <img src="img/bee1.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/bee2.jpg" />
                    </div>
                </div>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras a tincidunt magna. Morbi ac ultricies mi, at condimentum nisl. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                </p>
                <div class="buttons">
                    <button>Edytuj</button>
                    <button>Usuń</button>
                </div>

                <strong class="title">Inna nazwa</strong>
                <div class="images">
                    <div class="image-container">
                        <img src="img/turtle1.jpg" />
                    </div>
                </div>
                <p>
                    Sed viverra sit amet risus a eleifend. Donec sed dui ac mauris porta tempor vel non nunc. Duis tincidunt accumsan lectus, et maximus libero luctus in. Fusce consequat nisi non tincidunt interdum. Aliquam eget libero vel nunc tincidunt vestibulum eu et velit.
                </p>
                <div class="buttons">
                    <button>Edytuj</button>
                    <button>Usuń</button>
                </div>

            </div>
        </section>

        <!--********* CLOTHES **********************************************-->
        <section class="blog" id="clothes">
            <div class="post">
                <h2>&gt;&gt;&gt;&nbsp;UBRANIA&nbsp;&lt;&lt;&lt;</h2>

                <strong class="title">Jakaś nazwa</strong>
                <div class="images">
                    <div class="image-container">
                        <img src="img/pillow_front.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/bee1.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/pillow_back.jpg" />
                    </div>
                </div>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras a tincidunt magna. Morbi ac ultricies mi, at condimentum nisl. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                </p>
                <div class="buttons">
                    <button>Edytuj</button>
                    <button>Usuń</button>
                </div>

            </div>
        </section>
        
        <!--********* ACCESSORIES **********************************************-->
        <section class="blog" id="accessories">
            <div class="post">
                <h2>&gt;&gt;&gt;&nbsp;DODATKI&nbsp;&lt;&lt;&lt;</h2>

                <strong class="title">Jakaś nazwa</strong>
                <div class="images">
                    <div class="image-container">
                        <img src="img/pillow_front.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/bee1.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/pillow_back.jpg" />
                    </div>
                </div>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras a tincidunt magna. Morbi ac ultricies mi, at condimentum nisl. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                </p>
                <div class="buttons">
                    <button>Edytuj</button>
                    <button>Usuń</button>
                </div>

            </div>
        </section>
        
        <!--********* TOYS **********************************************-->
        <section class="blog" id="toys">
            <div class="post">
                <h2>&gt;&gt;&gt;&nbsp;ZABAWKI&nbsp;&lt;&lt;&lt;</h2>

                <strong class="title">Jakaś nazwa</strong>
                <div class="images">
                    <div class="image-container">
                        <img src="img/pillow_front.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/bee1.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/pillow_back.jpg" />
                    </div>
                </div>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras a tincidunt magna. Morbi ac ultricies mi, at condimentum nisl. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                </p>
                <div class="buttons">
                    <button>Edytuj</button>
                    <button>Usuń</button>
                </div>

            </div>
        </section>
        
        <!--********* OTHER **********************************************-->
        <section class="blog" id="other">
            <div class="post">
                <h2>&gt;&gt;&gt;&nbsp;INNE&nbsp;&lt;&lt;&lt;</h2>

                <strong class="title">Jakaś nazwa</strong>
                <div class="images">
                    <div class="image-container">
                        <img src="img/pillow_front.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/bee1.jpg" />
                    </div>
                    <div class="image-container">
                        <img src="img/pillow_back.jpg" />
                    </div>
                </div>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras a tincidunt magna. Morbi ac ultricies mi, at condimentum nisl. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                </p>
                <div class="buttons">
                    <button>Edytuj</button>
                    <button>Usuń</button>
                </div>

            </div>
        </section>
        
        <!--********* CONTACT **********************************************-->
        <section class="blog" id="contact">
            <div class="post">
                <h2>&gt;&gt;&gt;&nbsp;KONTAKT&nbsp;&lt;&lt;&lt;</h2>


            </div>
        </section>

        <!--********* FOOTER **********************************************-->
        <footer>
            <a href="mailto:triskelion.work@gmail.com"><span>&copy;triskelion16</span></a>
        </footer>
    </body>
</html>