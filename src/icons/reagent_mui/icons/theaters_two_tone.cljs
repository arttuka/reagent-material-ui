(ns reagent-mui.icons.theaters-two-tone
  "Imports @mui/icons-material/TheatersTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def theaters-two-tone (create-svg-icon [(e "path" #js {"d" "M18 3v2h-2V3H8v2H6V3H4v18h2v-2h2v2h8v-2h2v2h2V3h-2zM8 17H6v-2h2v2zm0-4H6v-2h2v2zm0-4H6V7h2v2zm6 10h-4V5h4v14zm4-2h-2v-2h2v2zm0-4h-2v-2h2v2zm0-4h-2V7h2v2z"}) (e "path" #js {"d" "M10 5h4v14h-4z", "opacity" ".3"})]
                                        "TheatersTwoTone"))
