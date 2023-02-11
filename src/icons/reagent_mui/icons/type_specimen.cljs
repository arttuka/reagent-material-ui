(ns reagent-mui.icons.type-specimen
  "Imports @mui/icons-material/TypeSpecimen as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def type-specimen (create-svg-icon [(e "path" #js {"d" "M4 6H2v14c0 1.1.9 2 2 2h14v-2H4V6z"}) (e "path" #js {"d" "M20 2H8c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2zm-3.37 12.5-.8-2.3H12.2l-.82 2.3H9.81l3.38-9h1.61l3.38 9h-1.55z"}) (e "path" #js {"d" "m13.96 7.17-1.31 3.72h2.69l-1.3-3.72z"})]
                                    "TypeSpecimen"))
