(ns reagent-mui.icons.tapas-two-tone
  "Imports @mui/icons-material/TapasTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def tapas-two-tone (create-svg-icon [(e "path" #js {"d" "M16 10V8h4v2c0 1.1-.9 2-2 2s-2-.9-2-2zM4 6c-.28 0-.5-.22-.5-.5S3.72 5 4 5h6c.28 0 .5.22.5.5s-.22.5-.5.5H4zm6 6H4c-.28 0-.5-.22-.5-.5s.22-.5.5-.5h6c.28 0 .5.22.5.5s-.22.5-.5.5z", "opacity" ".3"}) (e "path" #js {"d" "M22 10V1h-8v9c0 1.86 1.28 3.41 3 3.86V21h-2v2h6v-2h-2v-7.14c1.72-.45 3-2 3-3.86zm-2-7v3h-4V3h4zm-4 7V8h4v2c0 1.1-.9 2-2 2s-2-.9-2-2zm-6-1H8V8h2c1.38 0 2.5-1.12 2.5-2.5S11.38 3 10 3H8V1H6v2H4C2.62 3 1.5 4.12 1.5 5.5S2.62 8 4 8h2v1H4c-1.38 0-2.5 1.12-2.5 2.5S2.62 14 4 14h2v9h2v-9h2c1.38 0 2.5-1.12 2.5-2.5S11.38 9 10 9zM4 6c-.28 0-.5-.22-.5-.5S3.72 5 4 5h6c.28 0 .5.22.5.5s-.22.5-.5.5H4zm6 6H4c-.28 0-.5-.22-.5-.5s.22-.5.5-.5h6c.28 0 .5.22.5.5s-.22.5-.5.5z"})]
                                     "TapasTwoTone"))
