(ns reagent-material-ui.icons.crop-rotate-two-tone
  "Imports @material-ui/icons/CropRotateTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-rotate-two-tone (create-svg-icon (e "path" #js {"d" "M11.95 24c.23 0 .44-.02.66-.03L8.8 20.15l-1.33 1.34C4.2 19.93 1.86 16.76 1.5 13H0c.51 6.16 5.66 11 11.95 11zm.1-24c-.23 0-.44.02-.66.04l3.81 3.81 1.33-1.33C19.8 4.07 22.14 7.24 22.5 11H24c-.51-6.16-5.66-11-11.95-11zM16 6h-6v2h6v6h2V8c0-1.11-.9-2-2-2zm2 12h2v-2H8V4H6v2H4v2h2v8c0 1.1.89 2 2 2h8v2h2v-2z"})
                                           "CropRotateTwoTone"))
