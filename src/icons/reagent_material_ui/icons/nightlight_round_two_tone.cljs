(ns reagent-material-ui.icons.nightlight-round-two-tone
  "Imports @material-ui/icons/NightlightRoundTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def nightlight-round-two-tone (create-svg-icon (e "path" #js {"d" "M15.5 22c1.05 0 2.05-.16 3-.46-4.06-1.27-7-5.06-7-9.54s2.94-8.27 7-9.54c-.95-.3-1.95-.46-3-.46-5.52 0-10 4.48-10 10s4.48 10 10 10z"})
                                                "NightlightRoundTwoTone"))
