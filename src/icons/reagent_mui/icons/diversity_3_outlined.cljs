(ns reagent-mui.icons.diversity-3-outlined
  "Imports @mui/icons-material/Diversity3Outlined as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def diversity-3-outlined (create-svg-icon [(e "path" #js {"d" "M6.32 13.01c.96.02 1.85.5 2.45 1.34C9.5 15.38 10.71 16 12 16s2.5-.62 3.23-1.66c.6-.84 1.49-1.32 2.45-1.34-.72-1.22-3.6-2-5.68-2-2.07 0-4.96.78-5.68 2.01zM4 13c1.66 0 3-1.34 3-3S5.66 7 4 7s-3 1.34-3 3 1.34 3 3 3zm16 0c1.66 0 3-1.34 3-3s-1.34-3-3-3-3 1.34-3 3 1.34 3 3 3zm-8-3c1.66 0 3-1.34 3-3s-1.34-3-3-3-3 1.34-3 3 1.34 3 3 3z"}) (e "path" #js {"d" "M21 14h-3.27c-.77 0-1.35.45-1.68.92-.04.06-1.36 2.08-4.05 2.08-1.43 0-3.03-.64-4.05-2.08-.39-.55-1-.92-1.68-.92H3c-1.1 0-2 .9-2 2v4h7v-2.26c1.15.8 2.54 1.26 4 1.26s2.85-.46 4-1.26V20h7v-4c0-1.1-.9-2-2-2z"})]
                                           "Diversity3Outlined"))
