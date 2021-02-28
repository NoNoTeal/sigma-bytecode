public class \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubb2b\u3c25\ubf56\u183a\u5245\u4daf {
    public void \ubb2b\u3c25\ubf56\u183a\u5245\u4daf(\u5245\u8aa5\u61a4\u7049\u4cd9.\u1187\u4c04\u5db4\u1187\u0a06\u97b7 p0, \u494c\u4975\ua068\u0c95\uc84e.\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?> p2) {
        var_5_E6 : int
        var_6_114 : IntList
        var_7_11D : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putfield:\u1187\u4c04\u5db4\u1187\u0a06\u97b7(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4d85\u8753\ub8be\u5f50\u9937\ubff1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:\u1187\u4c04\u5db4\u1187\u0a06\u97b7)
            invokespecial:Object(Object::<init>, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)
            putfield:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, invokestatic:ArrayList[expected:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>](Lists::newArrayList))
            putfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, initobject:IntArrayList[expected:IntList](IntArrayList::<init>))
            putfield:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\uc84e\u8c8a\u34df\uff55\u183a\u5d20, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p2:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>)
            invokeinterface:boolean(List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>::addAll, getfield:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokeinterface:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>[expected:Collection<? extends \uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>](\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<C>::\ud51e\u6cfe\u36d3\u5f50\u5140\ubefe, p2:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>))
            invokeinterface:boolean(Collection<Object>::removeIf, getfield:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>[expected:Collection<Object>](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokedynamic:Predicate<? super Object>(test:()Ljava/util/function/Predicate;))
            putfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, invokeinterface:int(List<E>::size, getfield:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)))
            putfield:int[](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub32d\uc910\u6b0d\u927d\ub6ab\u71f1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, invokespecial:int[](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4f52\u965f\ube23\ub113\uc2e8\uc84e, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))
            putfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, arraylength:int(getfield:int[](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub32d\uc910\u6b0d\u927d\ub6ab\u71f1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)))
            putfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, initobject:BitSet(BitSet::<init>, add:int(add:int(add:int(getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), mul:int(getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)))))
            var_5_E6 = and:int(ldc:int(-9836), ldc:int(1642))
            
            while (cmplt:boolean(var_5_E6:int, invokeinterface:int(List<E>::size, getfield:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)))) {
                var_6_114 = invokevirtual:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u9033\ub171\u12b2\ua61f\u16f6\u3dd3, checkcast:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc.class, invokeinterface:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>::get, getfield:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), var_5_E6:int)))
                var_7_11D = and:int(ldc:int(-20624), ldc:int(20621))
                
                while (cmplt:boolean(var_7_11D:int, getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))) {
                    if (invokeinterface:boolean(IntList::contains, var_6_114:IntList, loadelement:int(getfield:int[](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub32d\uc910\u6b0d\u927d\ub6ab\u71f1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), var_7_11D:int))) {
                        invokevirtual:void(BitSet::set, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u9033\u718f\ufe34\u5bc4\uae87\ubefe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, and:int[expected:boolean](ldc:int(1509), ldc:int(2561)), var_7_11D:int, var_5_E6:int))
                    }
                    
                    inc:int(var_7_11D, ldc:int(1))
                }
                
                inc:int(var_5_E6, ldc:int(1))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \ud217\u67d0\ubf56\u385b\u99f7\u92ff(int p0, it.unimi.dsi.fastutil.ints.IntList p1) {
        var_3_5F : int
        var_3_B8 : int
        var_5_70 : int
        stack_1E9_0 : int [generated]
        var_3_1E8 : int
        var_6_F6 : int
        stack_21A_0 : int [generated]
        var_7_10E : int
        stack_1D0_1 : int [generated]
        var_3_23B : int
        var_8_25F : int
        var_9_26A : \u99f7\u8aa5\u8709\u52d3\u960f\u392e<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>
        var_10_273 : int
        var_3_2C0 : int
        var_11_2C8 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_5F = and:int(ldc:int(-770158580), ldc:int(-1364134407))
        
        if (cmpgt:boolean(p0:int, ldc:int(0))) {
            var_3_B8 = and:int(var_3_5F:int, ldc:int(-1221235669))
            var_5_70 = and:int(ldc:int(198), ldc:int(-199))
            
            loop {
                if (logicalnot:boolean(invokespecial:boolean(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub102\ub7dc\u98a4\ud171\ubcb0\u7d52, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:int))) {
                    do {
                        if (cmpne:boolean(and:int(var_3_B8:int, ldc:int(512)), ldc:int(0))) {
                            var_3_B8 = and:int(var_3_B8:int, ldc:int(1173941966))
                        }
                        else {
                            var_3_B8 = and:int(var_3_B8:int, ldc:int(-15022674))
                            
                            if (cmpne:boolean(var_5_70:int, getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))) {
                                loopcontinue()
                            }
                            
                            stack_1E9_0 = xor:int(ldc:int(-32764), ldc:int(-32763))
                            Label_0484:
                            var_3_1E8 = and:int(var_3_B8:int, ldc:int(-1422000930))
                            var_6_F6 = stack_1E9_0:int
                            
                            if (logicaland:boolean(cmpne:boolean(var_6_F6:int, ldc:int(0)), cmpne:boolean(p1:IntList, aconstnull:IntList()))) {
                                stack_21A_0 = xor:int(ldc:int(1026), ldc:int(1027))
                            }
                            else {
                                var_3_1E8 = and:int(var_3_1E8:int, ldc:int(-615161459))
                                stack_21A_0 = and:int(ldc:int(13318), ldc:int(-13479))
                            }
                            
                            var_3_B8 = and:int(var_3_1E8:int, ldc:int(-2034941893))
                            var_7_10E = stack_21A_0:int
                            
                            if (cmpeq:boolean(var_7_10E:int, ldc:int(0))) {
                                goto(Label_0545)
                            }
                            
                            invokeinterface:void(IntList::clear, p1:IntList)
                            goto(Label_0545)
                        }
                    } while (cmpne:boolean(and:int(var_3_B8:int, ldc:int(64)), ldc:int(0)))
                    
                    var_3_B8 = and:int(var_3_B8:int, ldc:int(-1631730488))
                    stack_1E9_0 = and:int(ldc:int(-14365), ldc:int(14364))
                    goto(Label_0484)
                }
                
                invokestatic:int(\u1187\u4c04\u5db4\u1187\u0a06\u97b7::\uf9c5\uf9c5\ub113\ud4fe\uc4d2\u64f2, getfield:\u1187\u4c04\u5db4\u1187\u0a06\u97b7(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4d85\u8753\ub8be\u5f50\u9937\ubff1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), loadelement:int(getfield:int[](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub32d\uc910\u6b0d\u927d\ub6ab\u71f1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokeinterface:int(IntList::getInt, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), and:int(ldc:int(-28511), ldc:int(12046)))), p0:int)
                var_6_F6 = sub:int(invokeinterface:int(IntList::size, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), and:int(ldc:int(1025), ldc:int(177)))
                invokespecial:void(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ud36e\u71ae\u5fe1\u927d\u72f1\u1187, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, invokeinterface:int(IntList::getInt, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), var_6_F6:int))
                var_7_10E = and:int(ldc:int(-8875), ldc:int(8866))
                Label_0272:
                
                while (cmpne:boolean(and:int(var_3_B8:int, ldc:int(16384)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_3_B8:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0306)
                    }
                    
                    var_3_B8 = and:int(var_3_B8:int, ldc:int(-160279154))
                    
                    if (cmpge:boolean(var_7_10E:int, var_6_F6:int)) {
                        goto(Label_0306)
                    }
                    
                    if (cmpne:boolean(and:int(var_7_10E:int, and:int(ldc:int(16901), ldc:int(1075))), ldc:int(0))) {
                        var_3_B8 = and:int(var_3_B8:int, ldc:int(-2028248067))
                        stack_1D0_1 = and:int[expected:boolean](ldc:int(17072), ldc:int(-17073))
                    }
                    else {
                        stack_1D0_1 = xor:int[expected:boolean](ldc:int(-13312), ldc:int(-13311))
                    }
                    
                    var_3_B8 = and:int(var_3_B8:int, ldc:int(-2097395619))
                    invokespecial:void(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u98a4\uc229\ub18d\u3711\u3bd6\u5db4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, stack_1D0_1:boolean, invokevirtual:int(Integer::intValue, invokeinterface:Integer(IntList::get, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), var_7_10E:int)), invokevirtual:int(Integer::intValue, invokeinterface:Integer(IntList::get, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), add:int(var_7_10E:int, xor:int(ldc:int(13320), ldc:int(13321))))))
                    inc:int(var_7_10E, ldc:int(1))
                }
                
                var_3_B8 = and:int(var_3_B8:int, ldc:int(-187334832))
                goto(Label_0545)
                Label_0306:
                
                if (cmpeq:boolean(and:int(var_3_B8:int, ldc:int(8)), ldc:int(0))) {
                    var_3_B8 = and:int(var_3_B8:int, ldc:int(-661684801))
                }
                else {
                    if (cmpne:boolean(and:int(var_3_B8:int, ldc:int(32)), ldc:int(0))) {
                        var_3_B8 = and:int(var_3_B8:int, ldc:int(-1023748836))
                        goto(Label_0272)
                    }
                    
                    var_3_B8 = and:int(var_3_B8:int, ldc:int(-1560356840))
                    invokeinterface:void(IntList::clear, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))
                    invokevirtual:void(BitSet::clear, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), and:int(ldc:int(16813), ldc:int(-26542)), add:int(getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)))
                    inc:int(var_5_70, ldc:int(1))
                    loopcontinue()
                }
                
                Label_0545:
                
                if (cmpne:boolean(and:int(var_3_B8:int, ldc:int(1024)), ldc:int(0))) {
                    var_3_B8 = and:int(var_3_B8:int, ldc:int(-105225878))
                    goto(Label_0306)
                }
                
                if (cmpne:boolean(and:int(var_3_B8:int, ldc:int(8)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                goto(Label_0272)
            }
            
            var_3_23B = and:int(var_3_B8:int, ldc:int(-1824662440))
            invokevirtual:void(BitSet::clear, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), and:int(ldc:int(16697), ldc:int(-18810)), add:int(add:int(getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)))
            var_8_25F = and:int(ldc:int(4253), ldc:int(-22686))
            var_9_26A = invokeinterface:\u99f7\u8aa5\u8709\u52d3\u960f\u392e<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<C>::\ud51e\u6cfe\u36d3\u5f50\u5140\ubefe, getfield:\u3711\ud7e8\u69d9\u6c52\ub18d\u97b7<?>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\uc84e\u8c8a\u34df\uff55\u183a\u5d20, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))
            var_10_273 = and:int(ldc:int(-24987), ldc:int(24730))
            
            loop {
                if (cmplt:boolean(var_10_273:int, invokeinterface:int(List<E>::size, var_9_26A:List<Object>))) {
                    if (cmpeq:boolean(var_7_10E:int, ldc:int(0))) {
                        goto(Label_0685)
                    }
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\ub32d\u99f7\u5140\u51b2\ub1b9\ub32d, checkcast:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc.class, invokeinterface:Object(List<Object>::get, var_9_26A:List<Object>, var_10_273:int))))) {
                        goto(Label_0685)
                    }
                    
                    invokeinterface:boolean(IntList::add, p1:IntList, and:int(ldc:int(21548), ldc:int(-30253)))
                    goto(Label_0887)
                }
                
                Label_0661:
                
                if (cmpeq:boolean(and:int(var_3_23B:int, ldc:int(256)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                Label_0685:
                
                if (cmpeq:boolean(and:int(var_3_23B:int, ldc:int(16384)), ldc:int(0))) {
                    var_3_23B = and:int(var_3_23B:int, ldc:int(-1441152574))
                    goto(Label_0661)
                }
                
                var_3_2C0 = and:int(var_3_23B:int, ldc:int(-1009357350))
                var_11_2C8 = and:int(ldc:int(9158), ldc:int(-9159))
                
                while (cmplt:boolean(var_11_2C8:int, getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))) {
                    if (invokespecial:boolean(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8753\u624e\u93a2\u4e72\u16f6\u92ff, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, and:int[expected:boolean](ldc:int(-19318), ldc:int(19253)), var_8_25F:int, var_11_2C8:int)) {
                        invokespecial:void(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u98a4\uc229\ub18d\u3711\u3bd6\u5db4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, and:int[expected:boolean](ldc:int(3075), ldc:int(4961)), var_11_2C8:int, var_8_25F:int)
                        invokestatic:void(\u1187\u4c04\u5db4\u1187\u0a06\u97b7::\u4975\uc29a\u0c95\ud4fe\u3711\u3e75, getfield:\u1187\u4c04\u5db4\u1187\u0a06\u97b7(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4d85\u8753\ub8be\u5f50\u9937\ubff1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), loadelement:int(getfield:int[](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub32d\uc910\u6b0d\u927d\ub6ab\u71f1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), var_11_2C8:int), p0:int)
                        
                        if (cmpne:boolean(var_7_10E:int, ldc:int(0))) {
                            invokeinterface:boolean(IntList::add, p1:IntList, loadelement:int(getfield:int[](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub32d\uc910\u6b0d\u927d\ub6ab\u71f1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), var_11_2C8:int))
                        }
                    }
                    
                    var_3_2C0 = and:int(var_3_2C0:int, ldc:int(-1951382802))
                    inc:int(var_11_2C8, ldc:int(1))
                }
                
                var_3_23B = and:int(var_3_2C0:int, ldc:int(-685839862))
                inc:int(var_8_25F, ldc:int(1))
                Label_0887:
                inc:int(var_10_273, ldc:int(1))
            }
            
            return:boolean(var_6_F6:boolean)
        }
        
        return:boolean(and:int[expected:boolean](ldc:int(277), ldc:int(22667)))
    }
    
    private int[] \u4f52\u965f\ube23\ub113\uc2e8\uc84e() {
        var_1_5F : int
        var_3_67 : IntAVLTreeSet
        var_4_71 : Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>
        var_4_9C : IntIterator
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_5F = and:int(ldc:int(-1294429457), ldc:int(938591444))
            var_3_67 = initobject:IntAVLTreeSet(IntAVLTreeSet::<init>)
            var_4_71 = invokeinterface:Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>::iterator, getfield:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))
            
            loop {
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                    var_1_5F = and:int(var_1_5F:int, ldc:int(1992606439))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_71:Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>)) {
                        invokeinterface:boolean(IntCollection::addAll, var_3_67:IntCollection, invokevirtual:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u9033\ub171\u12b2\ua61f\u16f6\u3dd3, checkcast:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc.class, invokeinterface:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>::next, var_4_71:Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>))))
                        loopcontinue()
                    }
                }
                
                if (cmpne:boolean(and:int(var_1_5F:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_4_9C = invokeinterface:IntIterator(IntCollection::iterator, var_3_67:IntCollection)
            
            while (invokeinterface:boolean(IntIterator::hasNext, var_4_9C:IntIterator)) {
                if (invokestatic:boolean(\u1187\u4c04\u5db4\u1187\u0a06\u97b7::\uc238\uceb8\u960f\u416d\uc2bd\u34df, getfield:\u1187\u4c04\u5db4\u1187\u0a06\u97b7(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4d85\u8753\ub8be\u5f50\u9937\ubff1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokeinterface:int(IntIterator::nextInt, var_4_9C:IntIterator))) {
                    loopcontinue()
                }
                
                invokeinterface:void(IntIterator::remove, var_4_9C:IntIterator)
            }
            
            return:int[](invokeinterface:int[](IntCollection::toIntArray, var_3_67:IntAVLTreeSet))
        }
        
        goto(Label_0006)
    }
    
    private boolean \ub102\ub7dc\u98a4\ud171\ubcb0\u7d52(int p0) {
        var_2_299 : int
        var_4_66 : int
        var_5_6F : int
        var_6_21D : int
        stack_254_0 : int [generated]
        var_7_254 : boolean
        var_8_269 : int
        stack_2C4_0 : int [generated]
        var_2_2ED : int
        var_9_2C4 : int
        var_10_2CD : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_299 = and:int(ldc:int(-523405305), ldc:int(-868401501))
        var_4_66 = getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)
        var_5_6F = and:int(ldc:int(26639), ldc:int(-26768))
        
        loop {
            Label_0113:
            
            if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0457)
            }
            
            if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(33554432)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_299:int, ldc:int(512)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(-1019168003))
                    goto(Label_0274)
                }
                
                if (cmpne:boolean(and:int(var_2_299:int, ldc:int(33554432)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(1656412433))
                    goto(Label_0175)
                }
                
                var_2_299 = and:int(var_2_299:int, ldc:int(-670218205))
                
                if (cmpge:boolean(var_5_6F:int, var_4_66:int)) {
                    goto(Label_0175)
                }
                
                if (cmplt:boolean(invokeinterface:int(Int2IntMap::get, getfield:Int2IntMap(\u1187\u4c04\u5db4\u1187\u0a06\u97b7::\u36d3\u74b1\uc2bd\u183a\u52d3\u8308, getfield:\u1187\u4c04\u5db4\u1187\u0a06\u97b7(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4d85\u8753\ub8be\u5f50\u9937\ubff1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), loadelement:int(getfield:int[](\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub32d\uc910\u6b0d\u927d\ub6ab\u71f1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), var_5_6F:int)), p0:int)) {
                    goto(Label_0274)
                }
                
                invokespecial:void(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8753\u759a\u8640\u446c\u12b2\ua61f, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, and:int[expected:boolean](ldc:int(2220), ldc:int(-2749)), var_5_6F:int)
            }
            
            Label_0371:
            
            while (cmpeq:boolean(and:int(var_2_299:int, ldc:int(2097152)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(65536)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(1273078813))
                    goto(Label_0274)
                }
                
                if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(1081310641))
                    goto(Label_0175)
                }
                
                if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(262144)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(381683979))
                    loopcontinue(Label_0113)
                }
                
                var_2_299 = and:int(var_2_299:int, ldc:int(1482661239))
                
                if (invokeinterface:boolean(IntList::isEmpty, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))) {
                    goto(Label_0457)
                }
                
                var_6_21D = invokeinterface:int(IntList::size, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))
                
                if (cmpne:boolean(and:int(var_6_21D:int, and:int(ldc:int(16977), ldc:int(8463))), and:int(ldc:int(5), ldc:int(28979)))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(-149066679))
                    stack_254_0 = and:int(ldc:int(9609), ldc:int(-15754))
                }
                else {
                    stack_254_0 = xor:int(ldc:int(768), ldc:int(769))
                }
                
                var_2_299 = and:int(var_2_299:int, ldc:int(1278074847))
                var_7_254 = stack_254_0:boolean
                var_8_269 = invokeinterface:int(IntList::getInt, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), sub:int(var_6_21D:int, xor:int(ldc:int(10500), ldc:int(10501))))
                
                if (cmpeq:boolean(var_7_254:boolean, ldc:boolean(0))) {
                    if (logicalnot:boolean(invokespecial:boolean(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4daf\u6bb9\u97b7\u97e6\ub18d\u0b8e, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, var_8_269:int))) {
                        goto(Label_0457)
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_299 = and:int(var_2_299:int, ldc:int(-901816865))
                        
                        if (cmpne:boolean(var_7_254:boolean, ldc:boolean(0))) {
                            stack_2C4_0 = getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)
                            looporswitchbreak()
                        }
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(134217728)), ldc:int(0))) {
                        var_2_299 = and:int(var_2_299:int, ldc:int(1799343419))
                        stack_2C4_0 = var_4_66:int
                        looporswitchbreak()
                    }
                    
                    var_2_299 = and:int(var_2_299:int, ldc:int(-2146495932))
                }
                
                var_2_2ED = and:int(var_2_299:int, ldc:int(2075130917))
                var_9_2C4 = stack_2C4_0:int
                var_10_2CD = and:int(ldc:int(-27295), ldc:int(10910))
                
                loop {
                    if (cmpeq:boolean(and:int(var_2_2ED:int, ldc:int(262144)), ldc:int(0))) {
                        var_2_2ED = and:int(var_2_2ED:int, ldc:int(441272741))
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2ED:int, ldc:int(128)), ldc:int(0))) {
                        var_2_2ED = and:int(var_2_2ED:int, ldc:int(-518059375))
                        
                        if (cmplt:boolean(var_10_2CD:int, var_9_2C4:int)) {
                            if (logicalnot:boolean(invokespecial:boolean(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u960f\ub1b9\u3bd6\u8d98\u8bb0\u6b0d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, var_7_254:boolean, var_10_2CD:int))) {
                                if (invokespecial:boolean(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4bc8\u6fb0\ufcaf\u3a62\ud158\u446c, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, var_7_254:boolean, var_8_269:int, var_10_2CD:int)) {
                                    if (invokespecial:boolean(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8753\u624e\u93a2\u4e72\u16f6\u92ff, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, var_7_254:boolean, var_8_269:int, var_10_2CD:int)) {
                                        invokespecial:void(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8753\u759a\u8640\u446c\u12b2\ua61f, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, var_7_254:boolean, var_10_2CD:int)
                                        goto(Label_0757)
                                    }
                                }
                            }
                            
                            var_2_2ED = and:int(var_2_2ED:int, ldc:int(-131135033))
                            inc:int(var_10_2CD, ldc:int(1))
                            loopcontinue()
                        }
                    }
                    
                    Label_0757:
                    
                    if (cmpeq:boolean(and:int(var_2_2ED:int, ldc:int(1)), ldc:int(0))) {
                        var_2_2ED = and:int(var_2_2ED:int, ldc:int(2102289046))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_2_2ED:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_2ED = and:int(var_2_2ED:int, ldc:int(1007814074))
                            loopcontinue()
                        }
                        
                        var_2_2ED = and:int(var_2_2ED:int, ldc:int(1170063151))
                        var_10_2CD = invokeinterface:int(IntList::size, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))
                        
                        if (cmpeq:boolean(var_10_2CD:int, var_6_21D:int)) {
                            invokeinterface:int(IntList::removeInt, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), sub:int(var_10_2CD:int, and:int(ldc:int(73), ldc:int(4353))))
                        }
                    }
                    
                    Label_0815:
                    
                    if (cmpne:boolean(and:int(var_2_2ED:int, ldc:int(33554432)), ldc:int(0))) {
                        var_2_2ED = and:int(var_2_2ED:int, ldc:int(-608695328))
                        goto(Label_0757)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_2ED:int, ldc:int(128)), ldc:int(0))) {
                        looporswitchbreak()
                    }
                }
                
                var_2_299 = and:int(var_2_2ED:int, ldc:int(-654459389))
            }
            
            var_2_299 = and:int(var_2_299:int, ldc:int(867808887))
            goto(Label_0457)
            Label_0175:
            
            if (cmpne:boolean(and:int(var_2_299:int, ldc:int(8)), ldc:int(0))) {
                var_2_299 = and:int(var_2_299:int, ldc:int(-1576974801))
                goto(Label_0457)
            }
            
            if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0371)
            }
            
            if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(1073741824)), ldc:int(0))) {
                var_2_299 = and:int(var_2_299:int, ldc:int(-1059154914))
            }
            else {
                if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(2048)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(427028478))
                    loopcontinue()
                }
                
                return:boolean(and:int[expected:boolean](ldc:int(-1267), ldc:int(1266)))
            }
            
            Label_0274:
            
            if (cmpne:boolean(and:int(var_2_299:int, ldc:int(16777216)), ldc:int(0))) {
                var_2_299 = and:int(var_2_299:int, ldc:int(626983678))
            }
            else {
                if (cmpne:boolean(and:int(var_2_299:int, ldc:int(268435456)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(-215968343))
                    goto(Label_0371)
                }
                
                if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(1073741824)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(-488321400))
                    goto(Label_0175)
                }
                
                if (cmpne:boolean(and:int(var_2_299:int, ldc:int(128)), ldc:int(0))) {
                    var_2_299 = and:int(var_2_299:int, ldc:int(418185558))
                    loopcontinue()
                }
                
                var_2_299 = and:int(var_2_299:int, ldc:int(1080019587))
                inc:int(var_5_6F, ldc:int(1))
                loopcontinue()
            }
            
            Label_0457:
            
            if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(262144)), ldc:int(0))) {
                var_2_299 = and:int(var_2_299:int, ldc:int(333895031))
                goto(Label_0371)
            }
            
            if (cmpne:boolean(and:int(var_2_299:int, ldc:int(2097152)), ldc:int(0))) {
                goto(Label_0274)
            }
            
            if (cmpeq:boolean(and:int(var_2_299:int, ldc:int(262144)), ldc:int(0))) {
                goto(Label_0175)
            }
            
            if (cmpne:boolean(and:int(var_2_299:int, ldc:int(268435456)), ldc:int(0))) {
                var_2_299 = and:int(var_2_299:int, ldc:int(1674780745))
            }
            else {
                var_2_299 = and:int(var_2_299:int, ldc:int(-114336383))
                
                if (invokeinterface:boolean(IntList::isEmpty, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))) {
                    goto(Label_0274)
                }
                
                return:boolean(xor:int[expected:boolean](ldc:int(320), ldc:int(321)))
            }
        }
    }
    
    private boolean \u4daf\u6bb9\u97b7\u97e6\ub18d\u0b8e(int p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokevirtual:boolean(BitSet::get, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ud523\u6198\u4975\u76bc\u600f\ud171, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:int)))
        }
        
        goto(Label_0006)
    }
    
    private void \ud36e\u71ae\u5fe1\u927d\u72f1\u1187(int p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(BitSet::set, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ud523\u6198\u4975\u76bc\u600f\ud171, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:int))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \ud523\u6198\u4975\u76bc\u600f\ud171(int p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:int(add:int(add:int(getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), p0:int))
        }
        
        goto(Label_0006)
    }
    
    private boolean \u4bc8\u6fb0\ufcaf\u3a62\ud158\u446c(boolean p0, int p1, int p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokevirtual:boolean(BitSet::get, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u9033\u718f\ufe34\u5bc4\uae87\ubefe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:boolean, p1:int, p2:int)))
        }
        
        goto(Label_0006)
    }
    
    private boolean \u8753\u624e\u93a2\u4e72\u16f6\u92ff(boolean p0, int p1, int p2) {
        var_4_63 : int
        stack_A4_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_63 = and:int(ldc:int(1082223160), ldc:int(1468821049))
            
            if (cmpeq:boolean(p0:boolean, invokevirtual:boolean(BitSet::get, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), add:int(xor:int(ldc:int(-32764), ldc:int(-32763)), invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u9033\u718f\ufe34\u5bc4\uae87\ubefe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:boolean, p1:int, p2:int))))) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-322810253))
                stack_A4_0 = and:int(ldc:int(-10095), ldc:int(8806))
            }
            else {
                stack_A4_0 = xor:int(ldc:int(12), ldc:int(13))
            }
            
            return:boolean(stack_A4_0:int)
        }
        
        goto(Label_0006)
    }
    
    private void \u98a4\uc229\ub18d\u3711\u3bd6\u5db4(boolean p0, int p1, int p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(BitSet::flip, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), add:int(xor:int(ldc:int(257), ldc:int(256)), invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u9033\u718f\ufe34\u5bc4\uae87\ubefe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:boolean, p1:int, p2:int)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private int \u9033\u718f\ufe34\u5bc4\uae87\ubefe(boolean p0, int p1, int p2) {
        var_4_63 : int
        stack_90_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_63 = and:int(ldc:int(-268923549), ldc:int(-273172103))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_4_63 = and:int(var_4_63:int, ldc:int(-138784857))
                stack_90_0 = add:int(mul:int(p2:int, getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), p1:int)
            }
            else {
                stack_90_0 = add:int(mul:int(p1:int, getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), p2:int)
            }
            
            return:int(add:int(add:int(add:int(getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u8bb0\u69d9\u1187\u4c04\ucef1\uf995, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), mul:int(and:int(ldc:int(18946), ldc:int(1090)), stack_90_0:int)))
        }
        
        goto(Label_0006)
    }
    
    private void \u8753\u759a\u8640\u446c\u12b2\ua61f(boolean p0, int p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(BitSet::set, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u72f1\uf9c5\uc238\ubf56\u9033\u1187, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:boolean, p1:int))
            invokeinterface:boolean(IntList::add, getfield:IntList(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u7e3f\u8709\u0b8e\ub70c\u647c\ub18d, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private boolean \u960f\ub1b9\u3bd6\u8d98\u8bb0\u6b0d(boolean p0, int p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(invokevirtual:boolean(BitSet::get, getfield:BitSet(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ub83f\u4e72\u12cb\u7ce1\u4975\u5bc4, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf), invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u72f1\uf9c5\uc238\ubf56\u9033\u1187, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, p0:boolean, p1:int)))
        }
        
        goto(Label_0006)
    }
    
    private int \u72f1\uf9c5\uc238\ubf56\u9033\u1187(boolean p0, int p1) {
        var_3_61 : int
        stack_85_0 : int [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(-41151088), ldc:int(-1128561255))
            
            if (logicalnot:boolean(p0:boolean)) {
                var_3_61 = and:int(var_3_61:int, ldc:int(-1671805091))
                stack_85_0 = getfield:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u36d3\ubff1\u8413\u4daf\u624e\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)
            }
            else {
                stack_85_0 = and:int(ldc:int(19635), ldc:int(-19892))
            }
            
            return:int(add:int(stack_85_0:int, p1:int))
        }
        
        goto(Label_0006)
    }
    
    public int \u7bad\u40a9\uc84e\u839e\u97e6\u4cd9(int p0, it.unimi.dsi.fastutil.ints.IntList p1) {
        var_3_61 : int
        var_5_69 : int
        var_6_7B : int
        var_3_82 : int
        var_7_90 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_3_61 = and:int(ldc:int(627091788), ldc:int(-982845155))
            var_5_69 = and:int(ldc:int(29172), ldc:int(-31223))
            var_6_7B = add:int(invokestatic:int(Math::min, p0:int, invokespecial:int(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u3bd6\uae87\u8258\u4f4a\u92ee\u9937, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), xor:int(ldc:int(10753), ldc:int(10752)))
            
            loop {
                var_3_82 = and:int(var_3_61:int, ldc:int(-42615521))
                var_7_90 = div:int(add:int(var_5_69:int, var_6_7B:int), xor:int(ldc:int(8450), ldc:int(8448)))
                
                if (invokevirtual:boolean(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ud217\u67d0\ubf56\u385b\u99f7\u92ff, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, var_7_90:int, checkcast:IntList(it.unimi.dsi.fastutil.ints.IntList.class, aconstnull:IntList()))) {
                    if (cmpgt:boolean(sub:int(var_6_7B:int, var_5_69:int), and:int(ldc:int(13315), ldc:int(19137)))) {
                        goto(Label_0207)
                    }
                    
                    looporswitchbreak()
                }
                
                Label_0159:
                
                if (cmpne:boolean(and:int(var_3_82:int, ldc:int(4)), ldc:int(0))) {
                    var_3_61 = and:int(var_3_82:int, ldc:int(-142624436))
                    var_6_7B = var_7_90:int
                    loopcontinue()
                }
                
                var_3_82 = and:int(var_3_82:int, ldc:int(425302064))
                Label_0207:
                
                if (cmpeq:boolean(and:int(var_3_82:int, ldc:int(2048)), ldc:int(0))) {
                    goto(Label_0159)
                }
                
                var_3_61 = and:int(var_3_82:int, ldc:int(1434250093))
                var_5_69 = var_7_90:int
            }
            
            if (cmpgt:boolean(var_7_90:int, ldc:int(0))) {
                invokevirtual:boolean(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\ud217\u67d0\ubf56\u385b\u99f7\u92ff, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf, var_7_90:int, p1:IntList)
            }
            
            return:int(var_7_90:int)
        }
        
        goto(Label_0006)
    }
    
    private int \u3bd6\uae87\u8258\u4f4a\u92ee\u9937() {
        var_1_D3 : int
        var_3_65 : int
        var_4_6F : Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>
        var_5_AF : \uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc
        var_6_B8 : int
        var_7_C4 : IntListIterator
        var_1_F4 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_1_D3 = and:int(ldc:int(-327125709), ldc:int(-1361580752))
            var_3_65 = ldc:int(2147483647)
            var_4_6F = invokeinterface:Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>::iterator, getfield:List<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u6435\ufe34\u3c25\u4f4a\u72f1\uc7fe, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf))
            
            loop {
                if (cmpeq:boolean(and:int(var_1_D3:int, ldc:int(8)), ldc:int(0))) {
                    var_1_D3 = and:int(var_1_D3:int, ldc:int(-33627302))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_6F:Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>)) {
                        var_5_AF = checkcast:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc.class, invokeinterface:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc(Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>::next, var_4_6F:Iterator<\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc>))
                        var_6_B8 = and:int(ldc:int(11833), ldc:int(-11962))
                        var_7_C4 = invokeinterface:IntListIterator(IntList::iterator, invokevirtual:IntList(\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc::\u9033\ub171\u12b2\ua61f\u16f6\u3dd3, var_5_AF:\uc2bd\u8cae\u97e6\uc3e3\ua3b4\ub7dc))
                        
                        loop {
                            if (cmpeq:boolean(and:int(var_1_D3:int, ldc:int(134217728)), ldc:int(0))) {
                                var_1_D3 = and:int(var_1_D3:int, ldc:int(919323001))
                            }
                            else {
                                var_1_D3 = and:int(var_1_D3:int, ldc:int(-1429741287))
                                
                                if (invokeinterface:boolean(Iterator::hasNext, var_7_C4:Iterator)) {
                                    var_6_B8 = invokestatic:int(Math::max, var_6_B8:int, invokeinterface:int(Int2IntMap::get, getfield:Int2IntMap(\u1187\u4c04\u5db4\u1187\u0a06\u97b7::\u36d3\u74b1\uc2bd\u183a\u52d3\u8308, getfield:\u1187\u4c04\u5db4\u1187\u0a06\u97b7(\ubb2b\u3c25\ubf56\u183a\u5245\u4daf::\u4d85\u8753\ub8be\u5f50\u9937\ubff1, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf)), invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Iterator<Integer>::next, var_7_C4:Iterator<Integer>)))))
                                    loopcontinue()
                                }
                            }
                            
                            if (cmpne:boolean(and:int(var_1_D3:int, ldc:int(2147483647)), ldc:int(0))) {
                                looporswitchbreak()
                            }
                        }
                        
                        var_1_F4 = and:int(var_1_D3:int, ldc:int(-2580194))
                        
                        if (cmpgt:boolean(var_3_65:int, ldc:int(0))) {
                            var_3_65 = invokestatic:int(Math::min, var_3_65:int, var_6_B8:int)
                        }
                        
                        var_1_D3 = and:int(var_1_F4:int, ldc:int(-1467358309))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_1_D3:int, ldc:int(16777216)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_1_D3 = and:int(var_1_D3:int, ldc:int(486779610))
            }
            
            return:int(var_3_65:int)
        }
        
        goto(Label_0006)
    }
    
    static {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u0800\uc29a\u965f\ub102\ub102\u5654(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_6B2 : int
        var_5_8A : int
        var_6_91 : int
        var_7_A0 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_6BD : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_6B2 = and:int(ldc:int(1656151942), ldc:int(1497276382))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ubb2b\u3c25\ubf56\u183a\u5245\u4daf[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0180)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1598812492))
        }
        else {
            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(163370911))
            var_5_8A = and:int(ldc:int(9558), ldc:int(-9560))
            var_6_91 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_A0 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-31490), ldc:int(29441)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_6B2:int, ldc:int(956213140))
                    var_9_C8 = sub:double(var_7_A0:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_8A:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_91:int, xor:int(ldc:int(2061), ldc:int(2060)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(21537), ldc:int(321)))), var_7_A0:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_6B2 = and:int(var_3_DA:int, ldc:int(58623997))
                    var_14_115 = var_7_A0:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_8A:int), xor:int(ldc:int(768), ldc:int(769)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_91:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(403223342))
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1003177849))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-616634178))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1369894225))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1029)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-62382406))
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(2053416121))
                        goto(Label_0752)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0630)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1320841444))
                    }
                    else {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(343724011))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_91:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0630)
                            }
                            
                            goto(Label_0916)
                        }
                    }
                    
                    Label_0432:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(54025597))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(296556825))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(256)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1264305103))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(464822587))
                        goto(Label_1029)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1158190956))
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(994491085))
                        goto(Label_0752)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1835707563))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(440885352))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(306034634))
                        var_11_EB = and:int(ldc:int(2456), ldc:int(-3549))
                        goto(Label_1602)
                    }
                    
                    Label_0630:
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1202900491))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-559911106))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1029)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1326331944))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1563101644))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1409294427))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0916)
                        }
                    }
                    
                    Label_0752:
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-813954257))
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1275837961))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(915940394))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1817227054))
                        goto(Label_1176)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-420426404))
                        goto(Label_1029)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-570960838))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-824648804))
                            goto(Label_0630)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1375192613))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1107851287))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0916:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-713644344))
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1030241243))
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0752)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0630)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1146659006))
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1530372089))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_8A:int), var_7_A0:double)) {
                                var_11_EB = xor:int(ldc:int(8289), ldc:int(8288))
                                goto(Label_1176)
                            }
                        }
                    }
                    
                    Label_1029:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1481600349))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0916)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0752)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(8)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(2034653533))
                            goto(Label_0630)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(262144)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-79062226))
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-2118852721))
                        var_11_EB = and:int(ldc:int(-6306), ldc:int(6305))
                    }
                    
                    Label_1176:
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(450919607))
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1450)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1276647154))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                            goto(Label_1029)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-302571129))
                            goto(Label_0916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_0752)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1016598671))
                            goto(Label_0630)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-216978742))
                            goto(Label_0432)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1048576)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1678270474))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1450)
                            }
                        }
                    }
                    
                    Label_1308:
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1840649681))
                        goto(Label_1613)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(256)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2097152)), ldc:int(0))) {
                            goto(Label_1176)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1566782649))
                            goto(Label_1029)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-540068710))
                            goto(Label_0916)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1835845099))
                            goto(Label_0752)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(495178107))
                            goto(Label_0630)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_0432)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1366603715))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_8A:int, var_16_119:int)
                            goto(Label_1602)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1450:
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-767095588))
                        goto(Label_1613)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(128)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(2089258011))
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(787979328))
                        goto(Label_1029)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-502172940))
                        goto(Label_0752)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(882140280))
                        goto(Label_0630)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-346845363))
                        loopcontinue()
                    }
                    
                    var_3_6B2 = and:int(var_3_6B2:int, ldc:int(733847527))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1602:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_6BD = var_5_8A:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1613:
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-600255040))
                        goto(Label_1450)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(512)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(-1275702168))
                        goto(Label_1308)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1176)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1029)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0916)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0752)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_0630)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_6B2:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0432)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(1024)), ldc:int(0))) {
                        var_3_6B2 = and:int(var_3_6B2:int, ldc:int(855103443))
                        var_17_6BD = add:int(var_16_119:int, xor:int(ldc:int(-32730), ldc:int(-32729)))
                        looporswitchbreak()
                    }
                    
                    var_3_6B2 = and:int(var_3_6B2:int, ldc:int(162729565))
                }
                
                var_3_6B2 = and:int(var_3_6B2:int, ldc:int(1841100725))
                
                if (cmple:boolean(var_5_8A = var_17_6BD:int, sub:int(var_6_91:int, xor:int(ldc:int(594), ldc:int(595))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0180:
        
        if (cmpne:boolean(and:int(var_3_6B2:int, ldc:int(2147483647)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
