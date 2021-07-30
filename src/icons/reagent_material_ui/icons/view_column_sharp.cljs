(ns reagent-material-ui.icons.view-column-sharp
  "Imports @material-ui/icons/ViewColumnSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-column-sharp (create-svg-icon (e "path" #js {"d" "M14.67 5v14H9.33V5h5.34zm1 14H21V5h-5.33v14zm-7.34 0V5H3v14h5.33z"})
                                        "ViewColumnSharp"))
