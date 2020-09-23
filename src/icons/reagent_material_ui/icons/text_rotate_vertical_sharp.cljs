(ns reagent-material-ui.icons.text-rotate-vertical-sharp
  "Imports @material-ui/icons/TextRotateVerticalSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def text-rotate-vertical-sharp (create-svg-icon (e "path" #js {"d" "M15.75 5h-1.5L9.5 16h2.1l.9-2.2h5l.9 2.2h2.1L15.75 5zm-2.62 7L15 6.98 16.87 12h-3.74zM6 20l3-3H7V4H5v13H3l3 3z"})
                                                 "TextRotateVerticalSharp"))
