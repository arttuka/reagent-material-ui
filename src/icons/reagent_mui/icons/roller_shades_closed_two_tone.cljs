(ns reagent-mui.icons.roller-shades-closed-two-tone
  "Imports @mui/icons-material/RollerShadesClosedTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def roller-shades-closed-two-tone (create-svg-icon [(e "path" #js {"d" "M6 5h12v10H6z", "opacity" ".3"}) (e "path" #js {"d" "M20 19V3H4v16H2v2h8.25c0 .97.78 1.75 1.75 1.75s1.75-.78 1.75-1.75H22v-2h-2zm-9 0H6v-2h5v2zm7 0h-5v-2h5v2zm0-4H6V5h12v10z"})]
                                                    "RollerShadesClosedTwoTone"))
