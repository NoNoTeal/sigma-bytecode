public final class \u12b2\u7049\u8df4\uc9f6\uae87.\u0a06\u7d52\u97b7\u3504\uc246\u9937 {
    public void \u0a06\u7d52\u97b7\u3504\uc246\u9937(it.unimi.dsi.fastutil.doubles.DoubleList p0, it.unimi.dsi.fastutil.doubles.DoubleList p1, boolean p2, boolean p3) {
        var_7_6B : int
        var_8_74 : int
        var_9_79 : double
        var_11_81 : int
        var_12_89 : int
        var_13_90 : int
        var_14_E1 : int
        var_15_107 : int
        var_16_1B7 : int
        var_17_1E3 : double
        
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
            invokespecial:Object(Object::<init>, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937)
            var_7_6B = and:int(ldc:int(-10927), ldc:int(10920))
            var_8_74 = and:int(ldc:int(6442), ldc:int(-15659))
            var_9_79 = ldc:double(Double.NaN)
            var_11_81 = invokeinterface:int(DoubleList::size, p0:DoubleList)
            var_12_89 = invokeinterface:int(DoubleList::size, p1:DoubleList)
            var_13_90 = add:int(var_11_81:int, var_12_89:int)
            putfield:DoubleArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\ud12e\u3dd3\ud523\ua562\u71f1\u5fe1, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937, initobject:DoubleArrayList(DoubleArrayList::<init>, var_13_90:int))
            putfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u64f2\u8aa5\u8c8a\u71f1\u6d69\ua61f, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937, initobject:IntArrayList(IntArrayList::<init>, var_13_90:int))
            putfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u8413\u4f4a\u5db4\u4c04\u4f52\ub8be, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937, initobject:IntArrayList(IntArrayList::<init>, var_13_90:int))
            
            loop {
                var_14_E1 = ternaryop:int(cmpge:boolean(var_7_6B:int, var_11_81:int), and:int(ldc:int(17656), ldc:int(-25849)), xor:int(ldc:int(269), ldc:int(268)))
                var_15_107 = ternaryop:int(cmpge:boolean(var_8_74:int, var_12_89:int), and:int(ldc:int(1837), ldc:int(-1840)), and:int(ldc:int(4961), ldc:int(10397)))
                
                if (logicaland:boolean(cmpeq:boolean(var_14_E1:int, ldc:int(0)), cmpeq:boolean(var_15_107:int, ldc:int(0)))) {
                    looporswitchbreak()
                }
                
                var_16_1B7 = ternaryop:int(logicaland:boolean(cmpne:boolean(var_14_E1:int, ldc:int(0)), logicalor:boolean(cmpeq:boolean(var_15_107:int, ldc:int(0)), cmplt:boolean(invokeinterface:double(DoubleList::getDouble, p0:DoubleList, var_7_6B:int), add:double(invokeinterface:double(DoubleList::getDouble, p1:DoubleList, var_8_74:int), ldc:double(1.0E-7))))), and:int(ldc:int(26881), ldc:int(75)), and:int(ldc:int(11796), ldc:int(-15894)))
                var_17_1E3 = ternaryop:double(cmpeq:boolean(var_16_1B7:int, ldc:int(0)), invokeinterface:double(DoubleList::getDouble, p1:DoubleList, postincrement:int(1, var_8_74:int)), invokeinterface:double(DoubleList::getDouble, p0:DoubleList, postincrement:int(1, var_7_6B:int)))
                
                if (logicalor:boolean(cmpeq:boolean(var_7_6B:int, ldc:int(0)), cmpeq:boolean(var_14_E1:int, ldc:int(0)))) {
                    if (cmpeq:boolean(var_16_1B7:int, ldc:int(0))) {
                        if (logicalnot:boolean(p3:boolean)) {
                            loopcontinue()
                        }
                    }
                }
                
                if (logicalor:boolean(cmpeq:boolean(var_8_74:int, ldc:int(0)), cmpeq:boolean(var_15_107:int, ldc:int(0)))) {
                    if (cmpne:boolean(var_16_1B7:int, ldc:int(0))) {
                        if (logicalnot:boolean(p2:boolean)) {
                            loopcontinue()
                        }
                    }
                }
                
                if (cmpge:boolean(var_9_79:double, sub:double(var_17_1E3:double, ldc:double(1.0E-7)))) {
                    if (invokevirtual:boolean(DoubleArrayList::isEmpty, getfield:DoubleArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\ud12e\u3dd3\ud523\ua562\u71f1\u5fe1, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937))) {
                        loopcontinue()
                    }
                    
                    invokevirtual:int(IntArrayList::set, getfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u64f2\u8aa5\u8c8a\u71f1\u6d69\ua61f, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937), sub:int(invokevirtual:int(IntArrayList::size, getfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u64f2\u8aa5\u8c8a\u71f1\u6d69\ua61f, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937)), and:int(ldc:int(16649), ldc:int(4309))), sub:int(var_7_6B:int, xor:int(ldc:int(27136), ldc:int(27137))))
                    invokevirtual:int(IntArrayList::set, getfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u8413\u4f4a\u5db4\u4c04\u4f52\ub8be, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937), sub:int(invokevirtual:int(IntArrayList::size, getfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u8413\u4f4a\u5db4\u4c04\u4f52\ub8be, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937)), and:int(ldc:int(26713), ldc:int(1541))), sub:int(var_8_74:int, and:int(ldc:int(33), ldc:int(257))))
                }
                else {
                    invokevirtual:boolean(IntArrayList::add, getfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u64f2\u8aa5\u8c8a\u71f1\u6d69\ua61f, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937), sub:int(var_7_6B:int, and:int(ldc:int(3333), ldc:int(29225))))
                    invokevirtual:boolean(IntArrayList::add, getfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u8413\u4f4a\u5db4\u4c04\u4f52\ub8be, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937), sub:int(var_8_74:int, and:int(ldc:int(775), ldc:int(18641))))
                    invokevirtual:boolean(DoubleArrayList::add, getfield:DoubleArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\ud12e\u3dd3\ud523\ua562\u71f1\u5fe1, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937), var_17_1E3:double)
                    var_9_79 = var_17_1E3:double
                }
            }
            
            if (invokevirtual:boolean(DoubleArrayList::isEmpty, getfield:DoubleArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\ud12e\u3dd3\ud523\ua562\u71f1\u5fe1, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937))) {
                invokevirtual:boolean(DoubleArrayList::add, getfield:DoubleArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\ud12e\u3dd3\ud523\ua562\u71f1\u5fe1, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937), invokestatic:double(Math::min, invokeinterface:double(DoubleList::getDouble, p0:DoubleList, sub:int(var_11_81:int, xor:int(ldc:int(16496), ldc:int(16497)))), invokeinterface:double(DoubleList::getDouble, p1:DoubleList, sub:int(var_12_89:int, and:int(ldc:int(4101), ldc:int(10369))))))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u71ae\u4179\ub1b9\u1187\ub19c\ud158(\ub113\uc4d2\u183a\u527a\u6435.\uc3e3\u5f50\u5bc4\ud217\u97e6.\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246 p0) {
        var_2_5F : int
        var_4_67 : int
        
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
        var_2_5F = and:int(ldc:int(-859055869), ldc:int(-370681841))
        var_4_67 = and:int(ldc:int(11038), ldc:int(-11167))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(65536)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1592041357))
            }
            else {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-495979021))
                
                if (cmplt:boolean(var_4_67:int, sub:int(invokevirtual:int(DoubleArrayList::size, getfield:DoubleArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\ud12e\u3dd3\ud523\ua562\u71f1\u5fe1, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937)), xor:int(ldc:int(1546), ldc:int(1547))))) {
                    if (invokeinterface:boolean(\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246::\u7ce1\u5140\u9033\u718f\u67d0\u3e2a, p0:\uc4d2\u9af2\u6c52\ud523\u6b5f\uc246, invokevirtual:int(IntArrayList::getInt, getfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u64f2\u8aa5\u8c8a\u71f1\u6d69\ua61f, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937), var_4_67:int), invokevirtual:int(IntArrayList::getInt, getfield:IntArrayList(\u0a06\u7d52\u97b7\u3504\uc246\u9937::\u8413\u4f4a\u5db4\u4c04\u4f52\ub8be, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937), var_4_67:int), var_4_67:int)) {
                        var_2_5F = and:int(var_2_5F:int, ldc:int(-857213025))
                        inc:int(var_4_67, ldc:int(1))
                        loopcontinue()
                    }
                    
                    return:boolean(and:int[expected:boolean](ldc:int(18963), ldc:int(-18964)))
                }
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                return:boolean(xor:int[expected:boolean](ldc:int(-32736), ldc:int(-32735)))
            }
        }
    }
    
    public it.unimi.dsi.fastutil.doubles.DoubleList \u759a\u873d\u5140\u67e9\u2dcc\u760c() {
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
            return:DoubleList(getfield:DoubleArrayList[expected:DoubleList](\u0a06\u7d52\u97b7\u3504\uc246\u9937::\ud12e\u3dd3\ud523\ua562\u71f1\u5fe1, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937))
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
    
    public void \ubff1\u527a\u72f1\u5db4\u7006\u3e75(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_63C : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C9 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_647 : int
        
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
        var_3_63C = and:int(ldc:int(-1850021084), ldc:int(100590381))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u0a06\u7d52\u97b7\u3504\uc246\u9937[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
            var_3_63C = and:int(var_3_63C:int, ldc:int(-609697247))
        }
        else {
            var_3_63C = and:int(var_3_63C:int, ldc:int(-142707858))
            var_5_85 = and:int(ldc:int(2851), ldc:int(-2872))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-10493), ldc:int(8444)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C9 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_63C:int, ldc:int(-977637512))
                    var_9_C9 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_8C:int, and:int(ldc:int(9217), ldc:int(4747)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(1065), ldc:int(16721)))), var_7_9B:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_63C = and:int(var_3_DA:int, ldc:int(1740564323))
                    var_14_115 = var_7_9B:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(96), ldc:int(97)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_8C:int)) {
                        var_9_C9 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-946161686))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1047825080))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(149048109))
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(343682877))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(490626864))
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1207582052))
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1085770553))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(570096497))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0597)
                            }
                            
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0421:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1138493259))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-751530457))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1430187305))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(284792157))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_0826)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(974109498))
                        goto(Label_0724)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-573973243))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1411190727))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-33914971))
                        var_11_EB = and:int(ldc:int(23196), ldc:int(-23197))
                        goto(Label_1490)
                    }
                    
                    Label_0597:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1692232572))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(2129783589))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-324223032))
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-2135266274))
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(801456425))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1215553478))
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1262416805))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C9:double
                            goto(Label_0826)
                        }
                    }
                    
                    Label_0724:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-308194366))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1733030333))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-334027))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C9:double, var_14_115:double))
                    }
                    
                    Label_0826:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1281192304))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1229324556))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16384)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(798258527))
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(2009069494))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_EB = xor:int(ldc:int(4131), ldc:int(4130))
                                goto(Label_1091)
                            }
                        }
                    }
                    
                    Label_0929:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(2053821154))
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-212735014))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-2102329367))
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1743104445))
                            goto(Label_0724)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1118551628))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1796364231))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1098605424))
                        var_11_EB = and:int(ldc:int(-16705), ldc:int(16704))
                    }
                    
                    Label_1091:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-41236226))
                        goto(Label_1501)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1362)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1665276382))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(755683749))
                            goto(Label_0929)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(1411582591))
                            goto(Label_0826)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(558458769))
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(703197161))
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0421)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1803184057))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1362)
                            }
                        }
                    }
                    
                    Label_1218:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(633493531))
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(8)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-113613695))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(313792310))
                            goto(Label_1091)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0929)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(536870912)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(2023322004))
                            goto(Label_0826)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-2015114675))
                            goto(Label_0724)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0597)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(-1677794086))
                            goto(Label_0421)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                            var_3_63C = and:int(var_3_63C:int, ldc:int(201024430))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_85:int, var_16_119:int)
                            goto(Label_1490)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1362:
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1501)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(38839554))
                        goto(Label_1091)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-157303997))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(935185075))
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2097152)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1180238543))
                        loopcontinue()
                    }
                    
                    var_3_63C = and:int(var_3_63C:int, ldc:int(1631223792))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1490:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_647 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1501:
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-869350495))
                        goto(Label_1362)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(-1321278070))
                        goto(Label_1218)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1091)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0929)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(1407383211))
                        goto(Label_0826)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0724)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0597)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0421)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
                        var_3_63C = and:int(var_3_63C:int, ldc:int(389770213))
                        var_17_647 = add:int(var_16_119:int, and:int(ldc:int(9281), ldc:int(305)))
                        looporswitchbreak()
                    }
                }
                
                var_3_63C = and:int(var_3_63C:int, ldc:int(1673195515))
                
                if (cmple:boolean(var_5_85 = var_17_647:int, sub:int(var_6_8C:int, and:int(ldc:int(8321), ldc:int(17253))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_63C:int, ldc:int(512)), ldc:int(0))) {
            var_3_63C = and:int(var_3_63C:int, ldc:int(1156108573))
            goto(Label_0106)
        }
    }
}
