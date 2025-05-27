def queue (item):
    conveyor_list = ["bag","shoes"]
    conveyor_list.append(item)
    print(conveyor_list)

    if len(conveyor_list)>0:
       dequeued_item=conveyor_list.pop(0)
       print(dequeued_item)


queue("Coat")

        