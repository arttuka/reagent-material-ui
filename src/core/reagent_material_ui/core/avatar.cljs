(ns reagent-material-ui.core.avatar
  "Imports @material-ui/core/Avatar as a Reagent component.
   Original documentation is at https://material-ui.com/api/avatar/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/core/Avatar" :as Avatar]))

(def avatar (adapt-react-class (or (.-default Avatar) (.-Avatar Avatar)) "mui-avatar"))
