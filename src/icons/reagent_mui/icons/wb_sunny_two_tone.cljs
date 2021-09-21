(ns reagent-mui.icons.wb-sunny-two-tone
  "Imports @mui/icons-material/WbSunnyTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def wb-sunny-two-tone (create-svg-icon [(e "path" #js {"d" "M12 7.5c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4z", "opacity" ".3"}) (e "path" #js {"d" "m5.34 6.25 1.42-1.41-1.8-1.79-1.41 1.41zM1 10.5h3v2H1zM11 .55h2V3.5h-2zm7.66 5.705-1.41-1.407 1.79-1.79 1.406 1.41zM17.24 18.16l1.79 1.8 1.41-1.41-1.8-1.79zM20 10.5h3v2h-3zm-8-5c-3.31 0-6 2.69-6 6s2.69 6 6 6 6-2.69 6-6-2.69-6-6-6zm0 10c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4zm-1 4h2v2.95h-2zm-7.45-.96 1.41 1.41 1.79-1.8-1.41-1.41z"})]
                                        "WbSunnyTwoTone"))
