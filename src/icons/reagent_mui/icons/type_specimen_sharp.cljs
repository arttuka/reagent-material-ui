(ns reagent-mui.icons.type-specimen-sharp
  "Imports @mui/icons-material/TypeSpecimenSharp as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def type-specimen-sharp (create-svg-icon [(e "path" #js {"d" "M4 6H2v16h16v-2H4z"}) (e "path" #js {"d" "M22 2H6v16h16V2zm-5.37 12.5-.8-2.3H12.2l-.82 2.3H9.81l3.38-9h1.61l3.38 9h-1.55z"}) (e "path" #js {"d" "m13.96 7.17-1.31 3.72h2.69l-1.3-3.72z"})]
                                          "TypeSpecimenSharp"))
