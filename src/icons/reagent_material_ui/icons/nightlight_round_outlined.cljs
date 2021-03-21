(ns reagent-material-ui.icons.nightlight-round-outlined
  "Imports @material-ui/icons/NightlightRoundOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def nightlight-round-outlined (create-svg-icon (e "path" #js {"d" "M15.5 22c1.05 0 2.05-.16 3-.46-4.06-1.27-7-5.06-7-9.54s2.94-8.27 7-9.54c-.95-.3-1.95-.46-3-.46-5.52 0-10 4.48-10 10s4.48 10 10 10z"})
                                                "NightlightRoundOutlined"))
