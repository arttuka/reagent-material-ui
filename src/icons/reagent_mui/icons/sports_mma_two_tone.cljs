(ns reagent-mui.icons.sports-mma-two-tone
  "Imports @mui/icons-material/SportsMmaTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sports-mma-two-tone (create-svg-icon [(e "path" #js {"d" "M15 5H7v5.6c0 .14.64 3.4.64 3.4h8.72s.64-3.26.64-3.4V10h-2V5zm-1 5H8V7h6v3z", "opacity" ".3"}) (e "path" #js {"d" "M7 20c0 .55.45 1 1 1h8c.55 0 1-.45 1-1v-3H7v3zM18 7c-.55 0-1 .45-1 1V5c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v5.8c0 .13.01.26.04.39l.8 4c.09.47.5.8.98.8H17c.55 0 1.09-.44 1.2-.98l.77-3.83c.02-.12.03-.25.03-.38V8c0-.55-.45-1-1-1zm-1 3.6c0 .13-.64 3.4-.64 3.4H7.64S7 10.74 7 10.6V5h8v5h2v.6z"}) (e "path" #js {"d" "M8 7h6v3H8z"})]
                                          "SportsMmaTwoTone"))
