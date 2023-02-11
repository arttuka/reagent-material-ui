(ns reagent-mui.icons.add-home-two-tone
  "Imports @mui/icons-material/AddHomeTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def add-home-two-tone (create-svg-icon [(e "path" #js {"d" "M12 5.5 6 10v9h5.08c-.62-4.3 2.72-8 6.92-8v-1l-6-4.5z", "opacity" ".3"}) (e "path" #js {"d" "M6 19v-9l6-4.5 6 4.5v1c.7 0 1.37.1 2 .29V9l-8-6-8 6v12h7.68c-.3-.62-.5-1.29-.6-2H6z"}) (e "path" #js {"d" "M18 13c-2.76 0-5 2.24-5 5s2.24 5 5 5 5-2.24 5-5-2.24-5-5-5zm3 5.5h-2.5V21h-1v-2.5H15v-1h2.5V15h1v2.5H21v1z"})]
                                        "AddHomeTwoTone"))
