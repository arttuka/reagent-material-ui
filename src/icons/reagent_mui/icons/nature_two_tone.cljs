(ns reagent-mui.icons.nature-two-tone
  "Imports @mui/icons-material/NatureTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def nature-two-tone (create-svg-icon [(e "path" #js {"d" "M12.17 4.17c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.25-5-5-5z", "opacity" ".3"}) (e "path" #js {"d" "M19.17 9.17c0-3.87-3.13-7-7-7s-7 3.13-7 7c0 3.47 2.52 6.34 5.83 6.89V20H5v2h14v-2h-6v-3.88h-.03c3.49-.4 6.2-3.36 6.2-6.95zm-7 5c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.25 5-5 5z"})]
                                      "NatureTwoTone"))
