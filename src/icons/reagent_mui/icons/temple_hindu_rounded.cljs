(ns reagent-mui.icons.temple-hindu-rounded
  "Imports @mui/icons-material/TempleHinduRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def temple-hindu-rounded (create-svg-icon (e "path" #js {"d" "M6.6 11h10.8l-.9-3h-9zM20 12v1H4v-1c0-.55-.45-1-1-1s-1 .45-1 1v8c0 1.1.9 2 2 2h6v-3c0-1.1.9-2 2-2s2 .9 2 2v3h6c1.1 0 2-.9 2-2v-8c0-.55-.45-1-1-1s-1 .45-1 1zm-4.1-6L15 3V2c0-.55-.45-1-1-1s-1 .45-1 1v1h-2.03V2c0-.55-.45-1-1-1s-1 .45-1 1v1.12L8.1 6h7.8z"})
                                           "TempleHinduRounded"))
