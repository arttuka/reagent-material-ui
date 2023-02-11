(ns reagent-mui.icons.fire-hydrant-alt-rounded
  "Imports @mui/icons-material/FireHydrantAltRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fire-hydrant-alt-rounded (create-svg-icon [(e "path" #js {"d" "M19 11h-1V8h1c.55 0 1-.45 1-1s-.45-1-1-1h-1.35c-.82-2.33-3.04-4-5.65-4S7.17 3.67 6.35 6H5c-.55 0-1 .45-1 1s.45 1 1 1h1v3H5c-1.1 0-2 .9-2 2v2c0 1.1.9 2 2 2h1v3H5c-.55 0-1 .45-1 1s.45 1 1 1h14c.55 0 1-.45 1-1s-.45-1-1-1h-1v-3h1c1.1 0 2-.9 2-2v-2c0-1.1-.9-2-2-2zm-7 6.5c-1.93 0-3.5-1.57-3.5-3.5s1.57-3.5 3.5-3.5 3.5 1.57 3.5 3.5-1.57 3.5-3.5 3.5z"}) (e "circle" #js {"cx" "12", "cy" "14", "r" "1.5"})]
                                               "FireHydrantAltRounded"))
