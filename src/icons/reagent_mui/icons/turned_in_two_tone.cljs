(ns reagent-mui.icons.turned-in-two-tone
  "Imports @mui/icons-material/TurnedInTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def turned-in-two-tone (create-svg-icon [(e "path" #js {"d" "M17 3H7c-1.1 0-1.99.9-1.99 2L5 21l7-3 7 3V5c0-1.1-.9-2-2-2zm0 14.97-4.21-1.81-.79-.34-.79.34L7 17.97V5h10v12.97z"}) (e "path" #js {"d" "m7 17.97 4.21-1.81.79-.34.79.34L17 17.97V5H7z", "opacity" ".3"})]
                                         "TurnedInTwoTone"))
