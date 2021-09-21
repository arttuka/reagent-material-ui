(ns reagent-mui.icons.fast-forward-two-tone
  "Imports @mui/icons-material/FastForwardTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fast-forward-two-tone (create-svg-icon [(e "path" #js {"d" "M15 9.86v4.28L18.03 12zm-9 0v4.28L9.03 12z", "opacity" ".3"}) (e "path" #js {"d" "m4 18 8.5-6L4 6v12zm2-8.14L9.03 12 6 14.14V9.86zM21.5 12 13 6v12l8.5-6zM15 9.86 18.03 12 15 14.14V9.86z"})]
                                            "FastForwardTwoTone"))
