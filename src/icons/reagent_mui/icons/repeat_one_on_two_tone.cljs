(ns reagent-mui.icons.repeat-one-on-two-tone
  "Imports @mui/icons-material/RepeatOneOnTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def repeat-one-on-two-tone (create-svg-icon (e "path" #js {"d" "M21 1H3c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h18c1.1 0 2-.9 2-2V3c0-1.1-.9-2-2-2zm-2 18H7v3l-4-4 4-4v3h10v-4h2v6zm-9-8.5V9h3v6h-1.5v-4.5H10zm7-.5V7H7v4H5V5h12V2l4 4-4 4z"})
                                             "RepeatOneOnTwoTone"))
