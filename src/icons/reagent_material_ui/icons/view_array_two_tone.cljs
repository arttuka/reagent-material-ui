(ns reagent-material-ui.icons.view-array-two-tone
  "Imports @material-ui/icons/ViewArrayTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def view-array-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M4 5h3v13H4zm14 0h3v13h-3zM8 18h9V5H8v13zm2-11h5v9h-5V7z"}) (e "path" #js {"d" "M10 7h5v9h-5z", "opacity" ".3"}))
                                          "ViewArrayTwoTone"))
