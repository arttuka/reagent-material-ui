(ns reagent-material-ui.icons.local-fire-department-two-tone
  "Imports @material-ui/icons/LocalFireDepartmentTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def local-fire-department-two-tone (create-svg-icon [(e "path" #js {"d" "M12.58 15.07c-.2.92-.94 1.96-2.38 2.31 2.9 2.37 5.64.2 5.56-2.32 0-2.05-2.95-3.21-3.27-5.08-.87 2.26.41 3.66.09 5.09z", "opacity" ".3"}) (e "path" #js {"d" "M19.48 12.35c-1.57-4.08-7.16-4.3-5.81-10.23.1-.44-.37-.78-.75-.55C9.29 3.71 6.68 8 8.87 13.62c.18.46-.36.89-.75.59-1.81-1.37-2-3.34-1.84-4.75.06-.52-.62-.77-.91-.34C4.69 10.16 4 11.84 4 14.37c.38 5.6 5.11 7.32 6.81 7.54 2.43.31 5.06-.14 6.95-1.87 2.08-1.93 2.84-5.01 1.72-7.69zm-9.28 5.03c1.44-.35 2.18-1.39 2.38-2.31.33-1.43-.96-2.83-.09-5.09.33 1.87 3.27 3.04 3.27 5.08.08 2.53-2.66 4.7-5.56 2.32z"})]
                                                     "LocalFireDepartmentTwoTone"))
