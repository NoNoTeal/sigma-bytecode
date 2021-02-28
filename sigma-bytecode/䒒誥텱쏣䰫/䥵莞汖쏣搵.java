public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4975\u839e\u6c56\uc3e3\u6435 {
    public void \u4975\u839e\u6c56\uc3e3\u6435() {
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
            invokespecial:\ud158\u839e\u7006\uc3e3\u446c(\ud158\u839e\u7006\uc3e3\u446c::<init>, this:\u4975\u839e\u6c56\uc3e3\u6435, getstatic:\ucef1\u3504\u64f2\u6cfe\u52d3(\ucef1\u3504\u64f2\u6cfe\u52d3::\u760c\u3d4b\u62da\u3e75\u5bc4), loadelement:String(getstatic:String[](\u4975\u839e\u6c56\uc3e3\u6435::\u760c\ud158\u62da\u8c8a\ub171), and:int(ldc:int(26710), ldc:int(-26711))), loadelement:String(getstatic:String[](\u4975\u839e\u6c56\uc3e3\u6435::\u760c\ud158\u62da\u8c8a\ub171), xor:int(ldc:int(-30432), ldc:int(-30431))))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u8aa5\uc238\u61a4\ub32d\u8413(\u51b2\u6fb0\ufcaf\u61a4\u0800.\u983f\u7ce1\uceb8\ubded\u3a62 p0) {
        var_2_5F : int
        var_2_6B : int
        var_4_74 : Iterator<\ua3b4\u8aa5\ub113\ubf56\u873d>
        var_5_A0 : \ua3b4\u8aa5\ub113\ubf56\u873d
        
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
        var_2_5F = and:int(ldc:int(-2145853387), ldc:int(-1158092944))
        
        if (invokevirtual:boolean(\ud158\u839e\u7006\uc3e3\u446c::\u6c52\ub1b9\uc7fe\ucfaf\u5d20, this:\u4975\u839e\u6c56\uc3e3\u6435[expected:\ud158\u839e\u7006\uc3e3\u446c])) {
            var_2_6B = and:int(var_2_5F:int, ldc:int(-2049318219))
            var_4_74 = invokeinterface:Iterator<\ua3b4\u8aa5\ub113\ubf56\u873d>(List<\ua3b4\u8aa5\ub113\ubf56\u873d>::iterator, invokestatic:List<\ua3b4\u8aa5\ub113\ubf56\u873d>(\u3bd6\u6d99\ub113\u4d85\u71f1::\u8258\u3711\u72f1\u51b2\u4daf))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_74:Iterator<\ua3b4\u8aa5\ub113\ubf56\u873d>)) {
                var_5_A0 = checkcast:\ua3b4\u8aa5\ub113\ubf56\u873d(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\ua3b4\u8aa5\ub113\ubf56\u873d.class, invokeinterface:\ua3b4\u8aa5\ub113\ubf56\u873d(Iterator<\ua3b4\u8aa5\ub113\ubf56\u873d>::next, var_4_74:Iterator<\ua3b4\u8aa5\ub113\ubf56\u873d>))
                
                if (logicalnot:boolean(invokevirtual:boolean(\u5fe1\ufcaf\u64f2\uc246\u97b7::\ud7e8\u0800\uae87\u8d90\u183a, invokevirtual:\u5fe1\ufcaf\u64f2\uc246\u97b7(\u6b0d\ua068\uc4d2\u5245\u4d85::\u4daf\ud51e\ubb2b\uc2e8\u8c8a, invokestatic:\u6b0d\ua068\uc4d2\u5245\u4d85(\u6b0d\ua068\uc4d2\u5245\u4d85::\u9255\u6ec6\u12b2\ud51e\uc31c)), var_5_A0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))) {
                    if (cmpgt:boolean(getfield:int(\u7d52\u718f\u3776\u6fb0\ub83f::\u718f\u446c\u9a18\ubb2b\u69d9\ub8be, var_5_A0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]), ldc:int(30))) {
                        if (invokevirtual:boolean(\u7d52\u718f\u3776\u6fb0\ub83f::\ufe34\u8df4\uc2bd\u8aa5\u9af2\u527a, var_5_A0:\ua3b4\u8aa5\ub113\ubf56\u873d)) {
                            invokestatic:void(\u3bd6\u6d99\ub113\u4d85\u71f1::\uc84e\u120d\u71ae\u527a\u9937, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), invokeinterface:String(ITextComponent::getUnformattedComponentText, invokevirtual:ITextComponent(\u7d52\u718f\u3776\u6fb0\ub83f::\uf94d\u7c6b\u92ff\u071d\u7e3f\u69d9, var_5_A0:\ua3b4\u8aa5\ub113\ubf56\u873d[expected:\u7d52\u718f\u3776\u6fb0\ub83f]))), loadelement:String(getstatic:String[](\u4975\u839e\u6c56\uc3e3\u6435::\u760c\ud158\u62da\u8c8a\ub171), xor:int(ldc:int(-32464), ldc:int(-32462))))))
                        }
                    }
                }
                
                var_2_6B = and:int(var_2_6B:int, ldc:int(-32901840))
            }
        }
    }
    
    static {
        var_0_26C : int
        expr_6B : int [generated]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_C9_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_FE_0 : byte[] [generated]
        stack_12E_0 : byte[] [generated]
        stack_1C7_0 : byte[] [generated]
        stack_21A_0 : byte[] [generated]
        stack_27E_0 : byte[] [generated]
        stack_2FE_0 : byte[] [generated]
        var_4_1AA : int
        var_3_1AF : byte[]
        var_5_1B0 : int
        expr_1C7 : byte [generated]
        var_0_296 : int
        expr_27E : byte [generated]
        stack_2CA_2 : byte [generated]
        stack_2A1_0 : byte [generated]
        var_2_9C : byte[]
        expr_A0 : int [generated]
        var_3_209 : byte[]
        var_5_20A : int
        expr_CB : int [generated]
        expr_FE : int [generated]
        var_3_2ED : byte[]
        var_5_2EE : int
        var_3_13A : String
        stack_1A3_0 : String[] [generated]
        expr_14C : String[] [generated]
        
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
        var_0_26C = and:int(ldc:int(-176709400), ldc:int(-719915404))
        expr_6B = arraylength:int(stack_9C_0 = stack_9E_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1C7_0 = stack_21A_0 = stack_27E_0 = stack_2FE_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("K1dAWnFPPVvZ7EDY2jxVQ8pBf1u7y1rcxklkzErSS1Jiyb39zljaoklTUdxvyD5baMrR2jxVQ8pBf1u7y1rsy0Vd21g+WuxeS9JLUsJJCgZc")))
        
        if (cmpeq:boolean(expr_6B:int, ldc:int(0))) {
            goto(Label_0112)
        }
        
        var_4_1AA = expr_6B:int
        var_3_1AF = newarray:byte[](byte.class, expr_6B:int)
        var_5_1B0 = expr_6B:int
        Label_0434:
        
        while (cmpne:boolean(and:int(var_0_26C:int, ldc:int(32)), ldc:int(0))) {
            var_0_26C = and:int(var_0_26C:int, ldc:int(2071560230))
            var_5_1B0 = add:int(var_5_1B0:int, ldc:int(-1))
            expr_1C7 = loadelement:byte(stack_1C7_0:byte[], var_5_1B0:int)
            storeelement:byte(var_3_1AF:byte[], var_5_1B0:int, add:int(or:int(and:int(shl:int(expr_1C7:byte, xor:int(ldc:int(1027), ldc:int(1031))), ldc:int(-16)), and:int(shr:int(expr_1C7:byte[expected:int], xor:int(ldc:int(4739), ldc:int(4743))), ldc:int(15))), ldc:int(83)))
            
            if (cmpne:boolean(var_5_1B0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1C7_0 = stack_21A_0 = stack_27E_0 = stack_2FE_0 = var_3_1AF:byte[]
            goto(Label_0112)
        }
        
        Label_0609:
        
        while (cmpne:boolean(and:int(var_0_26C:int, ldc:int(1073741824)), ldc:int(0))) {
            var_0_296 = and:int(var_0_26C:int, ldc:int(-8472089))
            var_5_1B0 = add:int(var_5_1B0:int, ldc:int(-1))
            expr_27E = stack_2CA_2 = loadelement(stack_27E_0, var_5_1B0)
            
            if (cmplt:boolean(add:int(add:int(var_5_1B0:int, ldc:int(2)), neg:int(var_4_1AA:int)), ldc:int(0))) {
                stack_2CA_2 = stack_2A1_0 = add:byte(expr_27E:byte, loadelement:byte(var_3_1AF:byte[], add:int(var_5_1B0:int, ldc:int(2))))
                goto(Label_0689)
            }
            
            Label_0651:
            
            if (cmpeq:boolean(and:int(var_0_296:int, ldc:int(32)), ldc:int(0))) {
                var_0_296 = and:int(var_0_296:int, ldc:int(-1598333886))
            }
            else {
                var_0_296 = and:int(var_0_296:int, ldc:int(-172163477))
                stack_2CA_2 = stack_2A1_0 = add:byte(expr_27E:byte, ldc:byte(2))
            }
            
            Label_0689:
            
            if (cmpeq:boolean(and:int(var_0_296:int, ldc:int(268435456)), ldc:int(0))) {
                var_0_296 = and:int(var_0_296:int, ldc:int(-252372489))
                goto(Label_0651)
            }
            
            var_0_26C = and:int(var_0_296:int, ldc:int(2099621308))
            storeelement:byte(var_3_1AF:byte[], var_5_1B0:int, stack_2CA_2:byte)
            
            if (cmpne:boolean(var_5_1B0:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1C7_0 = stack_21A_0 = stack_27E_0 = stack_2FE_0 = var_3_1AF:byte[]
            goto(Label_0208)
        }
        
        var_0_26C = and:int(var_0_26C:int, ldc:int(-448586907))
        goto(Label_0434)
        Label_0112:
        
        if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_26C = and:int(var_0_26C:int, ldc:int(-1670021483))
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(1)), ldc:int(0))) {
            var_0_26C = and:int(var_0_26C:int, ldc:int(-1046535686))
            goto(Label_0208)
        }
        
        if (cmpeq:boolean(and:int(var_0_26C:int, ldc:int(256)), ldc:int(0))) {
            var_0_26C = and:int(var_0_26C:int, ldc:int(-741822021))
            var_2_9C = stack_9C_0:byte[]
            expr_A0 = add:int(arraylength:int(stack_9E_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A0:int, ldc:int(0))) {
                var_3_209 = newarray:byte[](byte.class, expr_A0:int)
                var_5_20A = expr_A0:int
                
                loop {
                    var_0_26C = and:int(var_0_26C:int, ldc:int(-10492884))
                    var_5_20A = add:int(var_5_20A:int, ldc:int(-1))
                    storeelement:byte(var_3_209:byte[], var_5_20A:int, add:int(shl:int(loadelement:byte(stack_21A_0:byte[], var_5_20A:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_9C:byte[], add:int(var_5_20A:int, xor:int(ldc:int(20483), ldc:int(20482)))), ldc:int(3)), and:int(ldc:int(5247), ldc:int(16927)))))
                    
                    if (cmpne:boolean(var_5_20A:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1C7_0 = stack_21A_0 = stack_27E_0 = stack_2FE_0 = var_3_209:byte[]
            }
        }
        
        Label_0165:
        
        if (cmpeq:boolean(and:int(var_0_26C:int, ldc:int(32768)), ldc:int(0))) {
            goto(Label_0259)
        }
        
        if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(32)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_26C:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_26C = and:int(var_0_26C:int, ldc:int(-1846669336))
                goto(Label_0112)
            }
            
            var_0_26C = and:int(var_0_26C:int, ldc:int(-606815005))
            expr_CB = arraylength:int(stack_CB_0:byte[])
            
            if (cmpne:boolean(expr_CB:int, ldc:int(0))) {
                var_4_1AA = expr_CB:int
                var_3_1AF = newarray:byte[](byte.class, expr_CB:int)
                var_5_1B0 = expr_CB:int
                goto(Label_0609)
            }
        }
        
        Label_0208:
        
        if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(4096)), ldc:int(0))) {
            var_0_26C = and:int(var_0_26C:int, ldc:int(-860956074))
        }
        else {
            if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(8388608)), ldc:int(0))) {
                goto(Label_0165)
            }
            
            if (cmpeq:boolean(and:int(var_0_26C:int, ldc:int(2147483647)), ldc:int(0))) {
                var_0_26C = and:int(var_0_26C:int, ldc:int(676702445))
                goto(Label_0112)
            }
            
            var_0_26C = and:int(var_0_26C:int, ldc:int(1970587562))
            expr_FE = arraylength:int(stack_FE_0:byte[])
            
            if (cmpne:boolean(expr_FE:int, ldc:int(0))) {
                var_3_2ED = newarray:byte[](byte.class, expr_FE:int)
                var_5_2EE = expr_FE:int
                
                loop {
                    var_0_26C = and:int(var_0_26C:int, ldc:int(1542633254))
                    var_5_2EE = add:int(var_5_2EE:int, ldc:int(-1))
                    storeelement:byte(var_3_2ED:byte[], var_5_2EE:int, xor:byte(loadelement:byte(stack_2FE_0:byte[], var_5_2EE:int), ldc:byte(23)))
                    
                    if (cmpne:boolean(var_5_2EE:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_C9_0 = stack_CB_0 = stack_FC_0 = stack_FE_0 = stack_12E_0 = stack_1C7_0 = stack_21A_0 = stack_27E_0 = stack_2FE_0 = var_3_2ED:byte[]
            }
        }
        
        Label_0259:
        
        if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(1)), ldc:int(0))) {
            var_0_26C = and:int(var_0_26C:int, ldc:int(885746576))
            goto(Label_0208)
        }
        
        if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0165)
        }
        
        if (cmpne:boolean(and:int(var_0_26C:int, ldc:int(256)), ldc:int(0))) {
            var_0_26C = and:int(var_0_26C:int, ldc:int(-694630320))
            goto(Label_0112)
        }
        
        var_3_13A = initobject:String(String::<init>, stack_12E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_1A3_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(551), ldc:int(18883)))
        expr_14C = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(2699), ldc:int(25683)))
        storeelement:String(expr_14C:String[], xor:int(ldc:int(24848), ldc:int(24850)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(-25465), ldc:int(25448)), and:int(ldc:int(12316), ldc:int(18972))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(4609), ldc:int(19713)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, and:int(ldc:int(16444), ldc:int(2077)), xor:int(ldc:int(-32609), ldc:int(-32545))))
        storeelement:String(expr_14C:String[], and:int(ldc:int(11832), ldc:int(-11966)), invokevirtual:String[expected:String](String::substring, var_3_13A:String, xor:int(ldc:int(-28618), ldc:int(-28554)), and:int(ldc:int(2676), ldc:int(1361))))
        putstatic:String[](\u4975\u839e\u6c56\uc3e3\u6435::\u760c\ud158\u62da\u8c8a\ub171, expr_14C:String[])
    }
    
    public void \ub19c\u51b2\ud12e\u0b8e\ua6bd(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_65D : int
        var_5_85 : int
        var_6_8C : int
        var_7_9B : double
        var_9_C1 : double
        var_3_D2 : int
        var_11_E3 : int
        var_14_10D : double
        var_16_111 : int
        var_12_109 : double
        var_17_668 : int
        
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
        var_3_65D = and:int(ldc:int(905872066), ldc:int(-913338883))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u4975\u839e\u6c56\uc3e3\u6435[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0175)
        }
        
        Label_0106:
        
        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
            var_3_65D = and:int(var_3_65D:int, ldc:int(-1945034572))
        }
        else {
            var_3_65D = and:int(var_3_65D:int, ldc:int(-954207015))
            var_5_85 = and:int(ldc:int(17943), ldc:int(-17944))
            var_6_8C = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_9B = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(16907), ldc:int(-16908)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C1 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D2 = and:int(var_3_65D:int, ldc:int(-1785026323))
                    var_9_C1 = sub:double(var_7_9B:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E3 = var_5_85:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E3:int, sub:int(var_6_8C:int, and:int(ldc:int(8193), ldc:int(27)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E3:int, and:int(ldc:int(4281), ldc:int(24835)))), var_7_9B:double))) {
                        inc:int(var_11_E3, ldc:int(1))
                    }
                    
                    var_3_65D = and:int(var_3_D2:int, ldc:int(591360749))
                    var_14_10D = var_7_9B:double
                    var_16_111 = var_11_E3:int
                }
                else {
                    var_11_E3 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_85:int), xor:int(ldc:int(768), ldc:int(769)))
                    var_12_109 = var_14_10D = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85)
                    
                    if (cmplt:boolean(var_16_111 = var_11_E3:int, var_6_8C:int)) {
                        var_9_C1 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E3:int)
                        var_16_111 = var_11_E3:int
                        var_14_10D = var_12_109:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1594818105))
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1295067766))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(695471035))
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1222744729))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(606196034))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1494598204))
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0695)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1645027022))
                    }
                    else {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1542132467))
                        
                        if (cmplt:boolean(var_16_111:int, var_6_8C:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0573)
                            }
                            
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0422:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(546254774))
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(617580538))
                        goto(Label_0914)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_0695)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1755776442))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1616913668))
                            var_11_E3 = and:int(ldc:int(-25849), ldc:int(25840))
                            goto(Label_1480)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0573:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1032866314))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1622083621))
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1738795802))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(1161584726))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(663390186))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10D = var_9_C1:double
                            goto(Label_0796)
                        }
                    }
                    
                    Label_0695:
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(610510143))
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4096)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1242682137))
                        var_14_10D = mul:double(ldc:double(0.5), add:double(var_9_C1:double, var_14_10D:double))
                    }
                    
                    Label_0796:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(55055485))
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1665611025))
                            goto(Label_0695)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(524288)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1709704787))
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1074637753))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1062082274))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_85:int), var_7_9B:double)) {
                                var_11_E3 = and:int(ldc:int(24593), ldc:int(1857))
                                goto(Label_1080)
                            }
                        }
                    }
                    
                    Label_0914:
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(232192787))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1411537069))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(128)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1370022142))
                            goto(Label_0695)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-2095950726))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(612135929))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1119094018))
                        var_11_E3 = and:int(ldc:int(23972), ldc:int(-24557))
                    }
                    
                    Label_1080:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1723582934))
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-944767031))
                        goto(Label_1340)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-315109939))
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-952273684))
                            goto(Label_0695)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4096)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(2099926087))
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(1483027299))
                            goto(Label_0422)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-682479582))
                            loopcontinue()
                        }
                        
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-82849557))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                                goto(Label_1340)
                            }
                        }
                    }
                    
                    Label_1228:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(524288)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(982005335))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_1080)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0914)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            goto(Label_0796)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0695)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0573)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(1508395917))
                            goto(Label_0422)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_65D = and:int(var_3_65D:int, ldc:int(-1381244682))
                            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10D:double, var_5_85:int, var_16_111:int)
                            goto(Label_1480)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_1340:
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_1491)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(498330125))
                        goto(Label_1228)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1837387950))
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-103293341))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        goto(Label_0796)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-618648759))
                        goto(Label_0695)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0573)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-817088791))
                        goto(Label_0422)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_65D = and:int(var_3_65D:int, ldc:int(-1687538451))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10D:double, ldc:double(0.0))
                    Label_1480:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_668 = var_5_85:int
                        
                        if (cmpeq:boolean(var_11_E3:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1491:
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(128)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1955245172))
                        goto(Label_1340)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(943375640))
                        goto(Label_1228)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(4096)), ldc:int(0))) {
                        goto(Label_1080)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(316603252))
                        goto(Label_0914)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-834068508))
                        goto(Label_0796)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0695)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(-1615926776))
                        goto(Label_0573)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(8)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(1643540629))
                        goto(Label_0422)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_65D:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_65D = and:int(var_3_65D:int, ldc:int(460203204))
                        var_17_668 = add:int(var_16_111:int, xor:int(ldc:int(17952), ldc:int(17953)))
                        looporswitchbreak()
                    }
                    
                    var_3_65D = and:int(var_3_65D:int, ldc:int(141694242))
                }
                
                var_3_65D = and:int(var_3_65D:int, ldc:int(22006998))
                
                if (cmple:boolean(var_5_85 = var_17_668:int, sub:int(var_6_8C:int, xor:int(ldc:int(-30696), ldc:int(-30695))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0175:
        
        if (cmpeq:boolean(and:int(var_3_65D:int, ldc:int(1073741824)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0106)
    }
}
