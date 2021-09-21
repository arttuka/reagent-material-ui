(ns reagent-mui.icons.dehaze-two-tone
  "Imports @mui/icons-material/DehazeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def dehaze-two-tone (create-svg-icon (e "path" #js {"d" "M2 16v2h20v-2H2zm0-5v2h20v-2H2zm0-5v2h20V6H2z"})
                                      "DehazeTwoTone"))
