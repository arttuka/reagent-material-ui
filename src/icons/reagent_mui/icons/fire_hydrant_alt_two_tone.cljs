(ns reagent-mui.icons.fire-hydrant-alt-two-tone
  "Imports @mui/icons-material/FireHydrantAltTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def fire-hydrant-alt-two-tone (create-svg-icon [(e "path" #js {"d" "M12 4c-1.47 0-2.75.81-3.44 2h6.89c-.7-1.19-1.98-2-3.45-2z", "opacity" ".3"}) (e "circle" #js {"cx" "12", "cy" "14", "r" "1.5", "opacity" ".3"}) (e "path" #js {"d" "M16 8H8v5H5v2h3v5h8v-5h3v-2h-3V8zm-4 9.5c-1.93 0-3.5-1.57-3.5-3.5s1.57-3.5 3.5-3.5 3.5 1.57 3.5 3.5-1.57 3.5-3.5 3.5z", "opacity" ".3"}) (e "path" #js {"d" "M12 10.5c-1.93 0-3.5 1.57-3.5 3.5s1.57 3.5 3.5 3.5 3.5-1.57 3.5-3.5-1.57-3.5-3.5-3.5zm0 5c-.83 0-1.5-.67-1.5-1.5s.67-1.5 1.5-1.5 1.5.67 1.5 1.5-.67 1.5-1.5 1.5z"}) (e "path" #js {"d" "M19 11h-1V8h2V6h-2.35c-.82-2.33-3.04-4-5.65-4S7.17 3.67 6.35 6H4v2h2v3H5c-1.1 0-2 .9-2 2v2c0 1.1.9 2 2 2h1v3H4v2h16v-2h-2v-3h1c1.1 0 2-.9 2-2v-2c0-1.1-.9-2-2-2zm-7-7c1.47 0 2.75.81 3.44 2H8.56c.69-1.19 1.97-2 3.44-2zm7 11h-3v5H8v-5H5v-2h3V8h8v5h3v2z"})]
                                                "FireHydrantAltTwoTone"))
