(ns reagent-mui.icons.laptop-chromebook-two-tone
  "Imports @mui/icons-material/LaptopChromebookTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def laptop-chromebook-two-tone (create-svg-icon [(e "path" #js {"d" "M4 5h16v10H4z", "opacity" ".3"}) (e "path" #js {"d" "M22 18V3H2v15H0v2h24v-2h-2zm-8 0h-4v-1h4v1zm6-3H4V5h16v10z"})]
                                                 "LaptopChromebookTwoTone"))
