(ns reagent-material-ui.icons.view-carousel-outlined
  "Imports @material-ui/icons/ViewCarouselOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-carousel-outlined (create-svg-icon (e "path" #js {"d" "M2 6h4v11H2zm5 13h10V4H7v15zM9 6h6v11H9V6zm9 0h4v11h-4z"})
                                             "ViewCarouselOutlined"))
