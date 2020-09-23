(ns reagent-material-ui.icons.horizontal-distribute
  "Imports @material-ui/icons/HorizontalDistribute as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def horizontal-distribute (create-svg-icon (e "path" #js {"d" "M4 22H2V2h2v20zM22 2h-2v20h2V2zm-8.5 5h-3v10h3V7z"})
                                            "HorizontalDistribute"))
