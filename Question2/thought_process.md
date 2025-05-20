Resourced are allocated to VMs based on these:

    Peak usage : The VMs with the highest peak usage get the highest priority
    The function of the VM: Vms that use the most processing power get servers with high processing power.
                           Vms that use the largest storage get the servers with the largest storage
                           Vms that use the largest RAM get the highest RAM

How to reduce power consumption:
   Vms not in use are put to sleep

How to reduce latency between dependent Vms:
   Store the VMs in one serve or different servers near each other
   Send the data to be shared in small packets(this also ensures the data is safe)
   Network routing: Use the shortest route possible to share the data 