(ns reagent-mui.icons.unsubscribe-sharp
  "Imports @mui/icons-material/UnsubscribeSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def unsubscribe-sharp (create-svg-icon (e "path" #js {"d" "M18.5 13c-1.93 0-3.5 1.57-3.5 3.5s1.57 3.5 3.5 3.5 3.5-1.57 3.5-3.5-1.57-3.5-3.5-3.5zm2 4h-4v-1h4v1zm-6.95 0c-.02-.17-.05-.33-.05-.5 0-2.76 2.24-5 5-5 .92 0 1.75.26 2.49.69V3H3v14h10.55zM12 10.5 5 7V5l7 3.5L19 5v2l-7 3.5z"})
                                        "UnsubscribeSharp"))
