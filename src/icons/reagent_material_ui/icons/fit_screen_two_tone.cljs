(ns reagent-material-ui.icons.fit-screen-two-tone
  "Imports @material-ui/icons/FitScreenTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def fit-screen-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M8 10h8v4H8z", "opacity" ".3"}) (e "path" #js {"d" "M6 16h12V8H6v8zm2-6h8v4H8v-4zm-4 5H2v3c0 1.1.9 2 2 2h3v-2H4v-3zm0-9h3V4H4c-1.1 0-2 .9-2 2v3h2V6zm16-2h-3v2h3v3h2V6c0-1.1-.9-2-2-2zm0 14h-3v2h3c1.1 0 2-.9 2-2v-3h-2v3z"}))
                                          "FitScreenTwoTone"))
