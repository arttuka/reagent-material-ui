(ns reagent-material-ui.icons.clear-all
  "Imports @material-ui/icons/ClearAll as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def clear-all (create-svg-icon (e "path" #js {"d" "M5 13h14v-2H5v2zm-2 4h14v-2H3v2zM7 7v2h14V7H7z"})
                                "ClearAll"))
