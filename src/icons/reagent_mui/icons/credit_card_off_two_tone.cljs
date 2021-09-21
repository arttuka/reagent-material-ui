(ns reagent-mui.icons.credit-card-off-two-tone
  "Imports @mui/icons-material/CreditCardOffTwoTone as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def credit-card-off-two-tone (create-svg-icon [(e "path" #js {"d" "M20 17.17V12h-5.17L20 17.17zM10.83 8H20V6H8.83l2 2zM4 6.83V8h1.17L4 6.83zM15.17 18l-6-6H4v6h11.17z", "opacity" ".3"}) (e "path" #js {"d" "M6.83 4H20c1.11 0 2 .89 2 2v12c0 .34-.08.66-.23.94L20 17.17V12h-5.17l-4-4H20V6H8.83l-2-2zm13.66 19.31L17.17 20H4c-1.11 0-2-.89-2-2l.01-12c0-.34.08-.66.23-.93L.69 3.51 2.1 2.1l19.8 19.8-1.41 1.41zM4 6.83V8h1.17L4 6.83zM15.17 18l-6-6H4v6h11.17z"})]
                                               "CreditCardOffTwoTone"))
