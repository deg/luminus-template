(ns {{name}}.common
  (:use [hiccup.page :only [html5 include-css]]))

(defn header []
  [:header "your heading here"])

(defn footer []
  [:footer "-=[{{name}}]=-"])

(defn layout [& content]
  (html5 
    [:head
     [:title "Welcome to {{name}}"]
     (include-css "/css/screen.css")]
    [:body
     (header)
     [:div#content content]
     (footer)]))