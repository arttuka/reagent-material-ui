(ns reagent-material-ui.icons.king-bed-rounded
  "Imports @material-ui/icons/KingBedRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def king-bed-rounded (create-svg-icon (e "path" #js {"d" "M20 10V7c0-1.1-.9-2-2-2H6c-1.1 0-2 .9-2 2v3c-1.1 0-2 .9-2 2v5h1.33l.51 1.53c.1.28.36.47.66.47.3 0 .56-.19.66-.47L5.67 17h12.67l.51 1.53c.09.28.35.47.65.47.3 0 .56-.19.66-.47l.51-1.53H22v-5c0-1.1-.9-2-2-2zm-9 0H6V7h5v3zm7 0h-5V7h5v3z"})
                                       "KingBedRounded"))
