(ns reagent-material-ui.icons.view-carousel-rounded
  "Imports @material-ui/icons/ViewCarouselRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def view-carousel-rounded (create-svg-icon (e "path" #js {"d" "M8 19h8c.55 0 1-.45 1-1V5c0-.55-.45-1-1-1H8c-.55 0-1 .45-1 1v13c0 .55.45 1 1 1zm-5-2h2c.55 0 1-.45 1-1V7c0-.55-.45-1-1-1H3c-.55 0-1 .45-1 1v9c0 .55.45 1 1 1zM18 7v9c0 .55.45 1 1 1h2c.55 0 1-.45 1-1V7c0-.55-.45-1-1-1h-2c-.55 0-1 .45-1 1z"})
                                            "ViewCarouselRounded"))
