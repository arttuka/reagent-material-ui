(ns reagent-mui.icons.mic-external-on-two-tone
  "Imports @mui/icons-material/MicExternalOnTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def mic-external-on-two-tone (create-svg-icon [(e "path" #js {"d" "M6.81 16h.38l.6-6H6.21z", "opacity" ".3"}) (e "path" #js {"d" "M9.22 7c.48-.53.78-1.23.78-2 0-1.66-1.34-3-3-3S4 3.34 4 5c0 .77.3 1.47.78 2h4.44z"}) (e "path" #js {"d" "M16 2c-2.21 0-4 1.79-4 4v12c0 1.1-.9 2-2 2s-2-.9-2-2h1l1-10H4l1 10h1c0 2.21 1.79 4 4 4s4-1.79 4-4V6c0-1.1.9-2 2-2s2 .9 2 2v16h2V6c0-2.21-1.79-4-4-4zM7.19 16h-.38l-.6-6h1.58l-.6 6z"})]
                                               "MicExternalOnTwoTone"))
