(ns reagent-mui.icons.oil-barrel-rounded
  "Imports @mui/icons-material/OilBarrelRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def oil-barrel-rounded (create-svg-icon (e "path" #js {"d" "M20 13c.55 0 1-.45 1-1s-.45-1-1-1h-1V5h1c.55 0 1-.45 1-1s-.45-1-1-1H4c-.55 0-1 .45-1 1s.45 1 1 1h1v6H4c-.55 0-1 .45-1 1s.45 1 1 1h1v6H4c-.55 0-1 .45-1 1s.45 1 1 1h16c.55 0 1-.45 1-1s-.45-1-1-1h-1v-6h1zm-8 3c-1.66 0-3-1.32-3-2.95 0-1.16.41-1.58 2.24-3.68.4-.46 1.12-.46 1.51 0 1.82 2.09 2.24 2.52 2.24 3.68C15 14.68 13.66 16 12 16z"})
                                         "OilBarrelRounded"))
