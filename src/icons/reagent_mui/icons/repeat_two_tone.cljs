(ns reagent-mui.icons.repeat-two-tone
  "Imports @mui/icons-material/RepeatTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def repeat-two-tone (create-svg-icon (e "path" #js {"d" "M7 22v-3h12v-6h-2v4H7v-3l-4 4zM21 6l-4-4v3H5v6h2V7h10v3z"})
                                      "RepeatTwoTone"))
