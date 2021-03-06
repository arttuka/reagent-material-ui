(ns reagent-material-ui.icons.crop-rounded
  "Imports @material-ui/icons/CropRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def crop-rounded (create-svg-icon (e "path" #js {"d" "M17 15h2V7c0-1.1-.9-2-2-2H9v2h8v8zM7 17V2c0-.55-.45-1-1-1s-1 .45-1 1v3H2c-.55 0-1 .45-1 1s.45 1 1 1h3v10c0 1.1.9 2 2 2h10v3c0 .55.45 1 1 1s1-.45 1-1v-3h3c.55 0 1-.45 1-1s-.45-1-1-1H7z"})
                                   "CropRounded"))
